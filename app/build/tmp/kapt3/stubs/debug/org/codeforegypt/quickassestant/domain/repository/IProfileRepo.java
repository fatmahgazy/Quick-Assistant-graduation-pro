package org.codeforegypt.quickassestant.domain.repository;

import org.codeforegypt.quickassestant.data.model.User;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lorg/codeforegypt/quickassestant/domain/repository/IProfileRepo;", "", "editProfile", "", "newEmail", "", "newAge", "newUsername", "newBloodType", "newPhone", "newGender", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editProfilePicture", "filePath", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userProfile", "Lorg/codeforegypt/quickassestant/data/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IProfileRepo {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object userProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.codeforegypt.quickassestant.data.model.User> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object editProfile(@org.jetbrains.annotations.NotNull
    java.lang.String newEmail, @org.jetbrains.annotations.NotNull
    java.lang.String newAge, @org.jetbrains.annotations.NotNull
    java.lang.String newUsername, @org.jetbrains.annotations.NotNull
    java.lang.String newBloodType, @org.jetbrains.annotations.NotNull
    java.lang.String newPhone, @org.jetbrains.annotations.NotNull
    java.lang.String newGender, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object editProfilePicture(@org.jetbrains.annotations.NotNull
    java.lang.String filePath, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}