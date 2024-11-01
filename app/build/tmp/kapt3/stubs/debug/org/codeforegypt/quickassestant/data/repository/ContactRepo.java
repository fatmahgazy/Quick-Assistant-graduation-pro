package org.codeforegypt.quickassestant.data.repository;

import org.codeforegypt.quickassestant.api.ContactsApi;
import org.codeforegypt.quickassestant.data.db.ContactDao;
import org.codeforegypt.quickassestant.data.db.UserDao;
import org.codeforegypt.quickassestant.data.model.ModifyContact;
import org.codeforegypt.quickassestant.data.model.Contact;
import org.codeforegypt.quickassestant.domain.repository.IContactRepo;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lorg/codeforegypt/quickassestant/data/repository/ContactRepo;", "Lorg/codeforegypt/quickassestant/domain/repository/IContactRepo;", "contactsApi", "Lorg/codeforegypt/quickassestant/api/ContactsApi;", "userDao", "Lorg/codeforegypt/quickassestant/data/db/UserDao;", "contactDao", "Lorg/codeforegypt/quickassestant/data/db/ContactDao;", "(Lorg/codeforegypt/quickassestant/api/ContactsApi;Lorg/codeforegypt/quickassestant/data/db/UserDao;Lorg/codeforegypt/quickassestant/data/db/ContactDao;)V", "addContact", "", "contact", "Lorg/codeforegypt/quickassestant/data/model/ModifyContact;", "(Lorg/codeforegypt/quickassestant/data/model/ModifyContact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContact", "Lorg/codeforegypt/quickassestant/data/model/Contact;", "(Lorg/codeforegypt/quickassestant/data/model/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getContacts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ContactRepo implements org.codeforegypt.quickassestant.domain.repository.IContactRepo {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.api.ContactsApi contactsApi = null;
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.data.db.UserDao userDao = null;
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.data.db.ContactDao contactDao = null;
    
    @javax.inject.Inject
    public ContactRepo(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.api.ContactsApi contactsApi, @org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.UserDao userDao, @org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.ContactDao contactDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addContact(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.ModifyContact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getContacts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<org.codeforegypt.quickassestant.data.model.Contact>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteContact(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.Contact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}