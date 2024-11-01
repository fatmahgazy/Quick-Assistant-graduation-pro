package org.codeforegypt.quickassestant.ui.fragments.emergencies.myemergency;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import org.codeforegypt.quickassestant.data.model.Emergency;
import org.codeforegypt.quickassestant.data.model.ModifyEmergency;
import org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyResult;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/myemergency/MyEmergencyViewModel;", "Landroidx/lifecycle/ViewModel;", "emergencyRepo", "Lorg/codeforegypt/quickassestant/domain/repository/IEmergencyRepo;", "(Lorg/codeforegypt/quickassestant/domain/repository/IEmergencyRepo;)V", "_emergencyState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/codeforegypt/quickassestant/data/model/Emergency;", "_isLoading", "", "emergencyState", "Lkotlinx/coroutines/flow/StateFlow;", "getEmergencyState", "()Lkotlinx/coroutines/flow/StateFlow;", "isLoading", "getMyEmergency", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MyEmergencyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo emergencyRepo = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<org.codeforegypt.quickassestant.data.model.Emergency>> _emergencyState;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<org.codeforegypt.quickassestant.data.model.Emergency>> emergencyState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject
    public MyEmergencyViewModel(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo emergencyRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<org.codeforegypt.quickassestant.data.model.Emergency>> getEmergencyState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void getMyEmergency() {
    }
}