package org.codeforegypt.quickassestant.ui.fragments.profile;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import org.codeforegypt.quickassestant.data.model.User;
import org.codeforegypt.quickassestant.data.repository.ProfileRepo;
import org.codeforegypt.quickassestant.domain.repository.IProfileRepo;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/profile/UserProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "profileRepo", "Lorg/codeforegypt/quickassestant/domain/repository/IProfileRepo;", "(Lorg/codeforegypt/quickassestant/domain/repository/IProfileRepo;)V", "_user", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/codeforegypt/quickassestant/data/model/User;", "userData", "Lkotlinx/coroutines/flow/StateFlow;", "getUserData", "()Lkotlinx/coroutines/flow/StateFlow;", "getUserProfile", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class UserProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.domain.repository.IProfileRepo profileRepo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<org.codeforegypt.quickassestant.data.model.User> _user = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.data.model.User> userData = null;
    
    @javax.inject.Inject
    public UserProfileViewModel(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.domain.repository.IProfileRepo profileRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.data.model.User> getUserData() {
        return null;
    }
    
    public final void getUserProfile() {
    }
}