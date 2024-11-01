package org.codeforegypt.quickassestant.ui.fragments.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.codeforegypt.quickassestant.data.model.User
import org.codeforegypt.quickassestant.domain.repository.IProfileRepo
import javax.inject.Inject

@HiltViewModel
class EditProfileViewModel @Inject constructor(
    private val repository: IProfileRepo
): ViewModel() {

    private val _pictureState = MutableStateFlow(EditProfilePictureResult.NORMAL)
    val pictureState = _pictureState.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        EditProfilePictureResult.NORMAL
    )

    private val _editProfileState = MutableStateFlow(EditProfileResult.NORMAL)
    val editProfileState = _editProfileState.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        EditProfileResult.NORMAL
    )

    private val _user = MutableStateFlow<User?>(null)
    val user = _user.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        null
    )

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        false
    )

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.userProfile().apply {
                _user.update { this }
            }
        }
    }

    fun editProfile(email: String, age: String, phone: String, username: String, bloodType: String, gender: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _isLoading.update { true }
            val result = repository.editProfile(
                email, age, username, bloodType, phone, gender
            )
            _isLoading.update { false }
            _editProfileState.update {
                if (result)
                    EditProfileResult.SUCCESS
                else
                    EditProfileResult.FAILED
            }
        }
    }

    fun editProfilePicture(filePath: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _isLoading.update { true }
            val result = repository.editProfilePicture(
                filePath
            )
            _isLoading.update { false }
            _pictureState.update {
                if (result)
                    EditProfilePictureResult.SUCCESS
                else
                    EditProfilePictureResult.FAILED
            }
        }
    }


}