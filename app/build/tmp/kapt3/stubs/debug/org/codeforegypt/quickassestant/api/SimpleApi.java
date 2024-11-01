package org.codeforegypt.quickassestant.api;

import kotlinx.coroutines.Deferred;
import org.codeforegypt.quickassestant.data.model.AuthModel;
import org.codeforegypt.quickassestant.data.model.ForgotPasswordMessage;
import org.codeforegypt.quickassestant.data.model.UserSignUpModel;
import org.codeforegypt.quickassestant.data.model.UserLoginModel;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0007H\'J(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H\'JZ\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H\'\u00a8\u0006\u0014"}, d2 = {"Lorg/codeforegypt/quickassestant/api/SimpleApi;", "", "forgotPasswordCode", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lorg/codeforegypt/quickassestant/data/model/ForgotPasswordMessage;", "email", "", "forgotPasswordNewPassword", "code", "newPassword", "login", "Lorg/codeforegypt/quickassestant/data/model/AuthModel;", "password", "signUp", "age", "bloodType", "fullName", "gender", "phone", "app_debug"})
public abstract interface SimpleApi {
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "auth/signup")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.AuthModel>> signUp(@retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email, @retrofit2.http.Field(value = "age")
    @org.jetbrains.annotations.NotNull
    java.lang.String age, @retrofit2.http.Field(value = "blood_type")
    @org.jetbrains.annotations.NotNull
    java.lang.String bloodType, @retrofit2.http.Field(value = "full_name")
    @org.jetbrains.annotations.NotNull
    java.lang.String fullName, @retrofit2.http.Field(value = "gender")
    @org.jetbrains.annotations.NotNull
    java.lang.String gender, @retrofit2.http.Field(value = "phone")
    @org.jetbrains.annotations.NotNull
    java.lang.String phone, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull
    java.lang.String password);
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "auth/login")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.AuthModel>> login(@retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull
    java.lang.String password);
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "user/code")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.ForgotPasswordMessage>> forgotPasswordCode(@retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "user/code")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.ForgotPasswordMessage>> forgotPasswordNewPassword(@retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email, @retrofit2.http.Field(value = "code")
    @org.jetbrains.annotations.NotNull
    java.lang.String code, @retrofit2.http.Field(value = "new")
    @org.jetbrains.annotations.NotNull
    java.lang.String newPassword);
}