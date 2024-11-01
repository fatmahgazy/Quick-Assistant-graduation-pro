package org.codeforegypt.quickassestant.ui.fragments.auth;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import org.codeforegypt.quickassestant.data.model.UserSignUpModel;
import org.codeforegypt.quickassestant.domain.repository.IAuthRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/auth/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lorg/codeforegypt/quickassestant/domain/repository/IAuthRepository;", "(Lorg/codeforegypt/quickassestant/domain/repository/IAuthRepository;)V", "_loadingState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_operationStatus", "Lorg/codeforegypt/quickassestant/ui/fragments/auth/SignUpResult;", "loadingState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoadingState", "()Lkotlinx/coroutines/flow/StateFlow;", "operationStatus", "getOperationStatus", "signUp", "", "userSignUpModel", "Lorg/codeforegypt/quickassestant/data/model/UserSignUpModel;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.domain.repository.IAuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<org.codeforegypt.quickassestant.ui.fragments.auth.SignUpResult> _operationStatus = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.auth.SignUpResult> operationStatus = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loadingState;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> loadingState = null;
    
    @javax.inject.Inject
    public SignUpViewModel(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.domain.repository.IAuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.auth.SignUpResult> getOperationStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoadingState() {
        return null;
    }
    
    public final void signUp(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.UserSignUpModel userSignUpModel) {
    }
}