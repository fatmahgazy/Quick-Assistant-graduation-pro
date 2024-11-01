package org.codeforegypt.quickassestant.ui.fragments.contacts;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import org.codeforegypt.quickassestant.data.model.Contact;
import org.codeforegypt.quickassestant.domain.repository.IContactRepo;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactsViewModel;", "Landroidx/lifecycle/ViewModel;", "contactRepo", "Lorg/codeforegypt/quickassestant/domain/repository/IContactRepo;", "(Lorg/codeforegypt/quickassestant/domain/repository/IContactRepo;)V", "_deleteContacts", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactResult;", "_getContacts", "", "Lorg/codeforegypt/quickassestant/data/model/Contact;", "_loadingState", "", "deleteContacts", "Lkotlinx/coroutines/flow/StateFlow;", "getDeleteContacts", "()Lkotlinx/coroutines/flow/StateFlow;", "getContact", "getGetContact", "loadingState", "getLoadingState", "deleteContact", "", "contact", "getContacts", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ContactsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.domain.repository.IContactRepo contactRepo = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<org.codeforegypt.quickassestant.data.model.Contact>> _getContacts;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<org.codeforegypt.quickassestant.data.model.Contact>> getContact = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<org.codeforegypt.quickassestant.ui.fragments.contacts.ContactResult> _deleteContacts;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.contacts.ContactResult> deleteContacts = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loadingState;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> loadingState = null;
    
    @javax.inject.Inject
    public ContactsViewModel(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.domain.repository.IContactRepo contactRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<org.codeforegypt.quickassestant.data.model.Contact>> getGetContact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<org.codeforegypt.quickassestant.ui.fragments.contacts.ContactResult> getDeleteContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoadingState() {
        return null;
    }
    
    public final void getContacts() {
    }
    
    public final void deleteContact(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.Contact contact) {
    }
}