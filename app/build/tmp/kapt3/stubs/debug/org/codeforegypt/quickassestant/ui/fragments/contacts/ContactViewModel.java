package org.codeforegypt.quickassestant.ui.fragments.contacts;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import org.codeforegypt.quickassestant.data.model.ModifyContact;
import org.codeforegypt.quickassestant.domain.repository.IContactRepo;
import org.codeforegypt.quickassestant.ui.fragments.contacts.ContactResult;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactViewModel;", "Landroidx/lifecycle/ViewModel;", "contactRepo", "Lorg/codeforegypt/quickassestant/domain/repository/IContactRepo;", "(Lorg/codeforegypt/quickassestant/domain/repository/IContactRepo;)V", "_contact", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactResult;", "_loadingState", "", "contact", "Lkotlinx/coroutines/flow/StateFlow;", "getContact", "()Lkotlinx/coroutines/flow/StateFlow;", "loadingState", "getLoadingState", "addContact", "", "Lorg/codeforegypt/quickassestant/data/model/ModifyContact;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ContactViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.domain.repository.IContactRepo contactRepo = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<org.codeforegypt.quickassestant.ui.fragments.contacts.ContactResult> _contact;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.contacts.ContactResult> contact = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loadingState;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> loadingState = null;
    
    @javax.inject.Inject
    public ContactViewModel(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.domain.repository.IContactRepo contactRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.contacts.ContactResult> getContact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoadingState() {
        return null;
    }
    
    public final void addContact(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.ModifyContact contact) {
    }
}