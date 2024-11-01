package org.codeforegypt.quickassestant.domain.repository;

import org.codeforegypt.quickassestant.data.model.Emergency;
import org.codeforegypt.quickassestant.data.model.ModifyEmergency;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lorg/codeforegypt/quickassestant/domain/repository/IEmergencyRepo;", "", "addEmergency", "", "report", "Lorg/codeforegypt/quickassestant/data/model/ModifyEmergency;", "(Lorg/codeforegypt/quickassestant/data/model/ModifyEmergency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmergency", "", "Lorg/codeforegypt/quickassestant/data/model/Emergency;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyEmergencies", "app_debug"})
public abstract interface IEmergencyRepo {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addEmergency(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.ModifyEmergency report, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMyEmergencies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<org.codeforegypt.quickassestant.data.model.Emergency>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getEmergency(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<org.codeforegypt.quickassestant.data.model.Emergency>> $completion);
}