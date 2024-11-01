package org.codeforegypt.quickassestant.ui.fragments.auth;

import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.AndroidEntryPoint;
import org.codeforegypt.quickassestant.R;
import org.codeforegypt.quickassestant.data.model.UserSignUpModel;
import org.codeforegypt.quickassestant.databinding.FragmentSignUpBinding;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0002J\n\u0010!\u001a\u0004\u0018\u00010\tH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/auth/SignUpFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/codeforegypt/quickassestant/databinding/FragmentSignUpBinding;", "binding", "getBinding", "()Lorg/codeforegypt/quickassestant/databinding/FragmentSignUpBinding;", "selectedBloodType", "", "selectedGender", "signUpViewModel", "Lorg/codeforegypt/quickassestant/ui/fragments/auth/SignUpViewModel;", "getSignUpViewModel", "()Lorg/codeforegypt/quickassestant/ui/fragments/auth/SignUpViewModel;", "signUpViewModel$delegate", "Lkotlin/Lazy;", "observeLoading", "", "observeSignUpResult", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showLoading", "visible", "", "validateSignUpDetails", "app_debug"})
public final class SignUpFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private java.lang.String selectedGender;
    @org.jetbrains.annotations.Nullable
    private java.lang.String selectedBloodType;
    @org.jetbrains.annotations.Nullable
    private org.codeforegypt.quickassestant.databinding.FragmentSignUpBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy signUpViewModel$delegate = null;
    
    public SignUpFragment() {
        super();
    }
    
    private final org.codeforegypt.quickassestant.databinding.FragmentSignUpBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.ui.fragments.auth.SignUpViewModel getSignUpViewModel() {
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
    
    private final void observeSignUpResult() {
    }
    
    private final java.lang.String validateSignUpDetails() {
        return null;
    }
    
    private final void observeLoading() {
    }
    
    private final void showLoading(boolean visible) {
    }
}