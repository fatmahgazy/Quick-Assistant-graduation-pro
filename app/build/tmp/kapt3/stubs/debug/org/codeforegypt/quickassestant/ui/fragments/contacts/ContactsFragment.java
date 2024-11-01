package org.codeforegypt.quickassestant.ui.fragments.contacts;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import dagger.hilt.android.AndroidEntryPoint;
import org.codeforegypt.quickassestant.R;
import org.codeforegypt.quickassestant.databinding.FragmentContactsBinding;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\u0012\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\u001a\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u00060"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/codeforegypt/quickassestant/databinding/FragmentContactsBinding;", "binding", "getBinding", "()Lorg/codeforegypt/quickassestant/databinding/FragmentContactsBinding;", "contactsAdapter", "Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactAdapter;", "isGeneral", "", "permission", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "getPermission", "()Landroidx/activity/result/ActivityResultLauncher;", "viewModel", "Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactsViewModel;", "getViewModel", "()Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "callPhone", "", "phone", "initContactsList", "initToolbar", "observeContactDeletion", "observeContacts", "observeLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onResume", "onViewCreated", "view", "showLoading", "visible", "Companion", "app_debug"})
public final class ContactsFragment extends androidx.fragment.app.Fragment {
    private boolean isGeneral = true;
    @org.jetbrains.annotations.Nullable
    private org.codeforegypt.quickassestant.databinding.FragmentContactsBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> permission = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.ui.fragments.contacts.ContactAdapter contactsAdapter = null;
    @org.jetbrains.annotations.NotNull
    public static final org.codeforegypt.quickassestant.ui.fragments.contacts.ContactsFragment.Companion Companion = null;
    
    public ContactsFragment() {
        super();
    }
    
    private final org.codeforegypt.quickassestant.databinding.FragmentContactsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.ActivityResultLauncher<java.lang.String> getPermission() {
        return null;
    }
    
    private final org.codeforegypt.quickassestant.ui.fragments.contacts.ContactsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
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
    public void onResume() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeLoading() {
    }
    
    private final void showLoading(boolean visible) {
    }
    
    private final void initToolbar() {
    }
    
    private final void observeContactDeletion() {
    }
    
    private final void callPhone(java.lang.String phone) {
    }
    
    private final void observeContacts() {
    }
    
    private final void initContactsList() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final org.codeforegypt.quickassestant.ui.fragments.contacts.ContactsFragment newInstance(boolean isGeneral) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactsFragment$Companion;", "", "()V", "newInstance", "Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactsFragment;", "isGeneral", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final org.codeforegypt.quickassestant.ui.fragments.contacts.ContactsFragment newInstance(boolean isGeneral) {
            return null;
        }
    }
}