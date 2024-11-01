package org.codeforegypt.quickassestant.data.repository;

import android.util.Log;
import org.codeforegypt.quickassestant.api.EmergencyApi;
import org.codeforegypt.quickassestant.data.db.UserDao;
import org.codeforegypt.quickassestant.data.model.Emergency;
import org.codeforegypt.quickassestant.data.model.ModifyEmergency;
import org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lorg/codeforegypt/quickassestant/data/repository/EmergencyRepo;", "Lorg/codeforegypt/quickassestant/domain/repository/IEmergencyRepo;", "emergencyApi", "Lorg/codeforegypt/quickassestant/api/EmergencyApi;", "user", "Lorg/codeforegypt/quickassestant/data/db/UserDao;", "(Lorg/codeforegypt/quickassestant/api/EmergencyApi;Lorg/codeforegypt/quickassestant/data/db/UserDao;)V", "addEmergency", "", "report", "Lorg/codeforegypt/quickassestant/data/model/ModifyEmergency;", "(Lorg/codeforegypt/quickassestant/data/model/ModifyEmergency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmergency", "", "Lorg/codeforegypt/quickassestant/data/model/Emergency;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyEmergencies", "app_debug"})
public final class EmergencyRepo implements org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.api.EmergencyApi emergencyApi = null;
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.data.db.UserDao user = null;
    
    @javax.inject.Inject
    public EmergencyRepo(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.api.EmergencyApi emergencyApi, @org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.UserDao user) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addEmergency(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.ModifyEmergency report, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getMyEmergencies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<org.codeforegypt.quickassestant.data.model.Emergency>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getEmergency(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<org.codeforegypt.quickassestant.data.model.Emergency>> $completion) {
        return null;
    }
}