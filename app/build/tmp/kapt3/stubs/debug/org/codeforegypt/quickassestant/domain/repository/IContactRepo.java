package org.codeforegypt.quickassestant.domain.repository;

import org.codeforegypt.quickassestant.data.model.ModifyContact;
import org.codeforegypt.quickassestant.data.model.Contact;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lorg/codeforegypt/quickassestant/domain/repository/IContactRepo;", "", "addContact", "", "contact", "Lorg/codeforegypt/quickassestant/data/model/ModifyContact;", "(Lorg/codeforegypt/quickassestant/data/model/ModifyContact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContact", "Lorg/codeforegypt/quickassestant/data/model/Contact;", "(Lorg/codeforegypt/quickassestant/data/model/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getContacts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IContactRepo {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addContact(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.ModifyContact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getContacts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<org.codeforegypt.quickassestant.data.model.Contact>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteContact(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.Contact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}