package org.codeforegypt.quickassestant.ui.fragments.more;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import org.codeforegypt.quickassestant.data.db.UserDao;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/more/MoreViewModel;", "Landroidx/lifecycle/ViewModel;", "userDao", "Lorg/codeforegypt/quickassestant/data/db/UserDao;", "(Lorg/codeforegypt/quickassestant/data/db/UserDao;)V", "_logout", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "logout", "Lkotlinx/coroutines/flow/StateFlow;", "getLogout", "()Lkotlinx/coroutines/flow/StateFlow;", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MoreViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.data.db.UserDao userDao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _logout = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> logout = null;
    
    @javax.inject.Inject
    public MoreViewModel(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.UserDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLogout() {
        return null;
    }
    
    public final void logout() {
    }
}