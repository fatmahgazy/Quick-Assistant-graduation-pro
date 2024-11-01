package org.codeforegypt.quickassestant.ui.fragments.profile;

import android.Manifest;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import com.bumptech.glide.Glide;
import dagger.hilt.android.AndroidEntryPoint;
import org.codeforegypt.quickassestant.data.model.User;
import org.codeforegypt.quickassestant.data.model.UserSignUpModel;
import org.codeforegypt.quickassestant.databinding.FragmentEditProfileBinding;
import java.io.File;
import java.io.FileOutputStream;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0002J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010\'\u001a\u00020\u000bH\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u001dH\u0002J\u0012\u00100\u001a\u00020\u001d2\b\u00101\u001a\u0004\u0018\u000102H\u0016J&\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u0002042\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010;\u001a\u00020\u001dH\u0002J\n\u0010<\u001a\u0004\u0018\u00010\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u000b0\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006="}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/profile/EditProfileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/codeforegypt/quickassestant/databinding/FragmentEditProfileBinding;", "binding", "getBinding", "()Lorg/codeforegypt/quickassestant/databinding/FragmentEditProfileBinding;", "photoPermission", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "photoPickerLauncher", "kotlin.jvm.PlatformType", "selectedBloodType", "selectedGender", "spinnerBloodType", "getSpinnerBloodType", "()[Ljava/lang/String;", "[Ljava/lang/String;", "spinnerItem", "getSpinnerItem", "viewModel", "Lorg/codeforegypt/quickassestant/ui/fragments/profile/EditProfileViewModel;", "getViewModel", "()Lorg/codeforegypt/quickassestant/ui/fragments/profile/EditProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkRequiredPermissionsGranted", "", "onGranted", "Lkotlin/Function0;", "getFileFromUri", "Ljava/io/File;", "uri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "getFileName", "imagesPermission", "initBloodTypeSpinner", "initGenderSpinner", "isImagesPermissionGranted", "", "observeEditProfileResult", "observeEditProfiolePictureResult", "observeLoading", "observeUser", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requestMultiplePermissions", "validateSignUpDetails", "app_debug"})
public final class EditProfileFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private org.codeforegypt.quickassestant.databinding.FragmentEditProfileBinding _binding;
    @org.jetbrains.annotations.Nullable
    private java.lang.String selectedBloodType;
    @org.jetbrains.annotations.Nullable
    private java.lang.String selectedGender;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] spinnerBloodType = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] spinnerItem = {"Male", "Female"};
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> photoPickerLauncher = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> photoPermission = null;
    
    public EditProfileFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.ui.fragments.profile.EditProfileViewModel getViewModel() {
        return null;
    }
    
    private final org.codeforegypt.quickassestant.databinding.FragmentEditProfileBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getSpinnerBloodType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getSpinnerItem() {
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
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initBloodTypeSpinner() {
    }
    
    private final void initGenderSpinner() {
    }
    
    private final void observeUser() {
    }
    
    private final void observeLoading() {
    }
    
    private final void requestMultiplePermissions() {
    }
    
    private final void checkRequiredPermissionsGranted(kotlin.jvm.functions.Function0<kotlin.Unit> onGranted) {
    }
    
    private final boolean isImagesPermissionGranted() {
        return false;
    }
    
    private final java.lang.String imagesPermission() {
        return null;
    }
    
    private final java.io.File getFileFromUri(android.net.Uri uri, android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getFileName(android.net.Uri uri, android.content.Context context) {
        return null;
    }
    
    private final void observeEditProfiolePictureResult() {
    }
    
    private final void observeEditProfileResult() {
    }
    
    private final java.lang.String validateSignUpDetails() {
        return null;
    }
}