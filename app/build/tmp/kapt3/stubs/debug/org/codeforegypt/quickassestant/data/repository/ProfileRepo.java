package org.codeforegypt.quickassestant.data.repository;

import android.util.Log;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.codeforegypt.quickassestant.api.ProfileApi;
import org.codeforegypt.quickassestant.data.db.UserDao;
import org.codeforegypt.quickassestant.data.model.User;
import org.codeforegypt.quickassestant.domain.repository.IProfileRepo;
import java.io.File;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JA\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0011\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lorg/codeforegypt/quickassestant/data/repository/ProfileRepo;", "Lorg/codeforegypt/quickassestant/domain/repository/IProfileRepo;", "userDao", "Lorg/codeforegypt/quickassestant/data/db/UserDao;", "profileApi", "Lorg/codeforegypt/quickassestant/api/ProfileApi;", "(Lorg/codeforegypt/quickassestant/data/db/UserDao;Lorg/codeforegypt/quickassestant/api/ProfileApi;)V", "editProfile", "", "newEmail", "", "newAge", "newUsername", "newBloodType", "newPhone", "newGender", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editProfilePicture", "filePath", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhotoPart", "Lokhttp3/MultipartBody$Part;", "file", "Ljava/io/File;", "getRequestBodyPart", "Lokhttp3/RequestBody;", "email", "userProfile", "Lorg/codeforegypt/quickassestant/data/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProfileRepo implements org.codeforegypt.quickassestant.domain.repository.IProfileRepo {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.data.db.UserDao userDao = null;
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.api.ProfileApi profileApi = null;
    
    @javax.inject.Inject
    public ProfileRepo(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.UserDao userDao, @org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.api.ProfileApi profileApi) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object userProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.codeforegypt.quickassestant.data.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object editProfile(@org.jetbrains.annotations.NotNull
    java.lang.String newEmail, @org.jetbrains.annotations.NotNull
    java.lang.String newAge, @org.jetbrains.annotations.NotNull
    java.lang.String newUsername, @org.jetbrains.annotations.NotNull
    java.lang.String newBloodType, @org.jetbrains.annotations.NotNull
    java.lang.String newPhone, @org.jetbrains.annotations.NotNull
    java.lang.String newGender, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object editProfilePicture(@org.jetbrains.annotations.NotNull
    java.lang.String filePath, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final okhttp3.RequestBody getRequestBodyPart(java.lang.String email) {
        return null;
    }
    
    private final okhttp3.MultipartBody.Part getPhotoPart(java.io.File file) {
        return null;
    }
}