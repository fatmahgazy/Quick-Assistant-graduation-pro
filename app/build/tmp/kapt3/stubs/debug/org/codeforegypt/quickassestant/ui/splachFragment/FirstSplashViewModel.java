package org.codeforegypt.quickassestant.ui.splachFragment;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import org.codeforegypt.quickassestant.data.db.UserDao;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/splachFragment/FirstSplashViewModel;", "Landroidx/lifecycle/ViewModel;", "userDao", "Lorg/codeforegypt/quickassestant/data/db/UserDao;", "(Lorg/codeforegypt/quickassestant/data/db/UserDao;)V", "_userExist", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "userE", "Lkotlinx/coroutines/flow/StateFlow;", "getUserE", "()Lkotlinx/coroutines/flow/StateFlow;", "userExist", "getUserExist", "()Z", "setUserExist", "(Z)V", "isUserExist", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class FirstSplashViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.data.db.UserDao userDao = null;
    private boolean userExist = false;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _userExist = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> userE = null;
    
    @javax.inject.Inject
    public FirstSplashViewModel(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.UserDao userDao) {
        super();
    }
    
    public final boolean getUserExist() {
        return false;
    }
    
    public final void setUserExist(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getUserE() {
        return null;
    }
    
    private final void isUserExist() {
    }
}