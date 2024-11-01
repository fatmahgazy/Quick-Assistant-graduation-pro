package org.codeforegypt.quickassestant.ui.fragments.emergencies.add;

import android.location.Location;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import org.codeforegypt.quickassestant.data.model.ModifyEmergency;
import org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyResult;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/add/AddEmergencyViewModel;", "Landroidx/lifecycle/ViewModel;", "myEmergencyRepo", "Lorg/codeforegypt/quickassestant/domain/repository/IEmergencyRepo;", "(Lorg/codeforegypt/quickassestant/domain/repository/IEmergencyRepo;)V", "_addEmergencyState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/emergancy/EmergencyResult;", "_isLoading", "", "addEmergencyState", "Lkotlinx/coroutines/flow/StateFlow;", "getAddEmergencyState", "()Lkotlinx/coroutines/flow/StateFlow;", "isLoading", "userLocation", "Landroid/location/Location;", "getUserLocation", "()Landroid/location/Location;", "setUserLocation", "(Landroid/location/Location;)V", "addEmergency", "", "report", "Lorg/codeforegypt/quickassestant/data/model/ModifyEmergency;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AddEmergencyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo myEmergencyRepo = null;
    @org.jetbrains.annotations.Nullable
    private android.location.Location userLocation;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyResult> _addEmergencyState;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyResult> addEmergencyState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject
    public AddEmergencyViewModel(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo myEmergencyRepo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.location.Location getUserLocation() {
        return null;
    }
    
    public final void setUserLocation(@org.jetbrains.annotations.Nullable
    android.location.Location p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyResult> getAddEmergencyState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void addEmergency(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.ModifyEmergency report) {
    }
}