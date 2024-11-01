package org.codeforegypt.quickassestant.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import org.codeforegypt.quickassestant.api.EmergencyApi;
import org.codeforegypt.quickassestant.data.db.UserDao;
import org.codeforegypt.quickassestant.data.repository.EmergencyRepo;
import org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo;
import retrofit2.Retrofit;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lorg/codeforegypt/quickassestant/di/EmergencyModule;", "", "()V", "provideEmergencyApi", "Lorg/codeforegypt/quickassestant/api/EmergencyApi;", "retrofit", "Lretrofit2/Retrofit;", "provideRepoEmergency", "Lorg/codeforegypt/quickassestant/domain/repository/IEmergencyRepo;", "emergencyApi", "userDao", "Lorg/codeforegypt/quickassestant/data/db/UserDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
public final class EmergencyModule {
    @org.jetbrains.annotations.NotNull
    public static final org.codeforegypt.quickassestant.di.EmergencyModule INSTANCE = null;
    
    private EmergencyModule() {
        super();
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityRetainedScoped
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo provideRepoEmergency(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.api.EmergencyApi emergencyApi, @org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.UserDao userDao) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityRetainedScoped
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.api.EmergencyApi provideEmergencyApi(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}