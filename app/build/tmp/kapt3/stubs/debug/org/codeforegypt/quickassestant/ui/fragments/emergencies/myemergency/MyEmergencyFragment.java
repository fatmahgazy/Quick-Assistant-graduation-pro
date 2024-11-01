package org.codeforegypt.quickassestant.ui.fragments.emergencies.myemergency;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import dagger.hilt.android.AndroidEntryPoint;
import org.codeforegypt.quickassestant.R;
import org.codeforegypt.quickassestant.databinding.FragmentMyEmergencyBinding;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyAdapter;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyResult;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006#"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/myemergency/MyEmergencyFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/codeforegypt/quickassestant/databinding/FragmentMyEmergencyBinding;", "binding", "getBinding", "()Lorg/codeforegypt/quickassestant/databinding/FragmentMyEmergencyBinding;", "myEmergencyAdapter", "Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/myemergency/MyEmergencyAdapter;", "myEmergencyViewModel", "Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/myemergency/MyEmergencyViewModel;", "getMyEmergencyViewModel", "()Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/myemergency/MyEmergencyViewModel;", "myEmergencyViewModel$delegate", "Lkotlin/Lazy;", "initEmergencyList", "", "initToolbar", "observeLoading", "observeOnEmergencies", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showLocation", "latitude", "", "longitude", "app_debug"})
public final class MyEmergencyFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private org.codeforegypt.quickassestant.databinding.FragmentMyEmergencyBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.ui.fragments.emergencies.myemergency.MyEmergencyAdapter myEmergencyAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy myEmergencyViewModel$delegate = null;
    
    public MyEmergencyFragment() {
        super();
    }
    
    private final org.codeforegypt.quickassestant.databinding.FragmentMyEmergencyBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.ui.fragments.emergencies.myemergency.MyEmergencyViewModel getMyEmergencyViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeLoading() {
    }
    
    private final void showLocation(double latitude, double longitude) {
    }
    
    private final void observeOnEmergencies() {
    }
    
    private final void initEmergencyList() {
    }
    
    private final void initToolbar() {
    }
}