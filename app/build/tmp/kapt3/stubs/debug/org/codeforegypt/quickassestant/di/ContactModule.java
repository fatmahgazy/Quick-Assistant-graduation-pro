package org.codeforegypt.quickassestant.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import org.codeforegypt.quickassestant.api.ContactsApi;
import org.codeforegypt.quickassestant.data.db.ContactDao;
import org.codeforegypt.quickassestant.data.db.UserDao;
import org.codeforegypt.quickassestant.data.db.UserDatabase;
import org.codeforegypt.quickassestant.data.repository.ContactRepo;
import org.codeforegypt.quickassestant.domain.repository.IContactRepo;
import retrofit2.Retrofit;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0007\u00a8\u0006\u0011"}, d2 = {"Lorg/codeforegypt/quickassestant/di/ContactModule;", "", "()V", "provideArticleApi", "Lorg/codeforegypt/quickassestant/api/ContactsApi;", "retrofit", "Lretrofit2/Retrofit;", "provideContactDao", "Lorg/codeforegypt/quickassestant/data/db/ContactDao;", "db", "Lorg/codeforegypt/quickassestant/data/db/UserDatabase;", "provideContactsRepository", "Lorg/codeforegypt/quickassestant/domain/repository/IContactRepo;", "contactsApi", "userDao", "Lorg/codeforegypt/quickassestant/data/db/UserDao;", "contactDao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
public final class ContactModule {
    @org.jetbrains.annotations.NotNull
    public static final org.codeforegypt.quickassestant.di.ContactModule INSTANCE = null;
    
    private ContactModule() {
        super();
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityRetainedScoped
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.api.ContactsApi provideArticleApi(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityRetainedScoped
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.domain.repository.IContactRepo provideContactsRepository(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.api.ContactsApi contactsApi, @org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.UserDao userDao, @org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.ContactDao contactDao) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityRetainedScoped
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.data.db.ContactDao provideContactDao(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.UserDatabase db) {
        return null;
    }
}