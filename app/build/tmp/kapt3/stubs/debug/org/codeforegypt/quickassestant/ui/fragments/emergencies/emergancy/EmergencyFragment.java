package org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.AndroidEntryPoint;
import org.codeforegypt.quickassestant.databinding.FragmentEmergancyBinding;
import org.codeforegypt.quickassestant.databinding.FragmentMyEmergencyBinding;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\u001a\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006,"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/emergancy/EmergencyFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/codeforegypt/quickassestant/databinding/FragmentEmergancyBinding;", "binding", "getBinding", "()Lorg/codeforegypt/quickassestant/databinding/FragmentEmergancyBinding;", "emergenciesViewModel", "Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/emergancy/EmergencyViewModule;", "getEmergenciesViewModel", "()Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/emergancy/EmergencyViewModule;", "emergenciesViewModel$delegate", "Lkotlin/Lazy;", "emergencyAdapter", "Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/emergancy/EmergencyAdapter;", "permission", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "getPermission", "()Landroidx/activity/result/ActivityResultLauncher;", "callPhone", "", "phone", "initEmergencyList", "initToolbar", "observeLoading", "observeOnEmergencies", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "showLocation", "latitude", "", "longitude", "app_debug"})
public final class EmergencyFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private org.codeforegypt.quickassestant.databinding.FragmentEmergancyBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy emergenciesViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyAdapter emergencyAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> permission = null;
    
    public EmergencyFragment() {
        super();
    }
    
    private final org.codeforegypt.quickassestant.databinding.FragmentEmergancyBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyViewModule getEmergenciesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.ActivityResultLauncher<java.lang.String> getPermission() {
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
    
    private final void callPhone(java.lang.String phone) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    private final void initEmergencyList() {
    }
    
    private final void observeOnEmergencies() {
    }
    
    private final void initToolbar() {
    }
}