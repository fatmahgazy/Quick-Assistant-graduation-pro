package org.codeforegypt.quickassestant.ui.fragments.auth.password;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import org.codeforegypt.quickassestant.domain.repository.IAuthRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/auth/password/ForgotPasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lorg/codeforegypt/quickassestant/domain/repository/IAuthRepository;", "(Lorg/codeforegypt/quickassestant/domain/repository/IAuthRepository;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/codeforegypt/quickassestant/ui/fragments/auth/password/ForgotPasswordState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCurrentViewState", "Lorg/codeforegypt/quickassestant/ui/fragments/auth/password/PasswordCurrentState;", "resetPassword", "", "code", "", "newPassword", "sendEmail", "email", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ForgotPasswordViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.domain.repository.IAuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<org.codeforegypt.quickassestant.ui.fragments.auth.password.ForgotPasswordState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.auth.password.ForgotPasswordState> state = null;
    
    @javax.inject.Inject
    public ForgotPasswordViewModel(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.domain.repository.IAuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.auth.password.ForgotPasswordState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.ui.fragments.auth.password.PasswordCurrentState getCurrentViewState() {
        return null;
    }
    
    public final void sendEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
    }
    
    public final void resetPassword(@org.jetbrains.annotations.NotNull
    java.lang.String code, @org.jetbrains.annotations.NotNull
    java.lang.String newPassword) {
    }
}