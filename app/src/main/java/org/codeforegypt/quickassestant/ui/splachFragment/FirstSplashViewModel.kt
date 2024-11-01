package org.codeforegypt.quickassestant.ui.splachFragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.codeforegypt.quickassestant.data.db.UserDao
import javax.inject.Inject

@HiltViewModel
class FirstSplashViewModel @Inject constructor(
    private val userDao: UserDao
): ViewModel() {

    var userExist = false

    init {
        isUserExist()
    }

    private val _userExist = MutableStateFlow(false)
    val userE = _userExist.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000),
        false
    )

    private fun isUserExist() {
        viewModelScope.launch(Dispatchers.IO) {
            val userExists = userDao.getUsers().isNotEmpty()
            userExist = userExists
        }
    }

}