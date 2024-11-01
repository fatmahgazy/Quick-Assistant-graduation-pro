package org.codeforegypt.quickassestant.api;

import kotlinx.coroutines.Deferred;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.codeforegypt.quickassestant.data.model.profile.UpdateUserResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JZ\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H\'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lorg/codeforegypt/quickassestant/api/ProfileApi;", "", "editProfile", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lorg/codeforegypt/quickassestant/data/model/profile/UpdateUserResponse;", "email", "", "newEmail", "age", "bloodType", "fullName", "phone", "gender", "editProfilePicture", "requestBody", "Lokhttp3/RequestBody;", "part", "Lokhttp3/MultipartBody$Part;", "app_debug"})
public abstract interface ProfileApi {
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "user/Edit")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.profile.UpdateUserResponse>> editProfile(@retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email, @retrofit2.http.Field(value = "new_email")
    @org.jetbrains.annotations.NotNull
    java.lang.String newEmail, @retrofit2.http.Field(value = "new_age")
    @org.jetbrains.annotations.NotNull
    java.lang.String age, @retrofit2.http.Field(value = "new_blood")
    @org.jetbrains.annotations.NotNull
    java.lang.String bloodType, @retrofit2.http.Field(value = "new_name")
    @org.jetbrains.annotations.NotNull
    java.lang.String fullName, @retrofit2.http.Field(value = "new_phone")
    @org.jetbrains.annotations.NotNull
    java.lang.String phone, @retrofit2.http.Field(value = "new_gender")
    @org.jetbrains.annotations.NotNull
    java.lang.String gender);
    
    @retrofit2.http.Multipart
    @retrofit2.http.POST(value = "updateimg")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.profile.UpdateUserResponse>> editProfilePicture(@retrofit2.http.Part(value = "email")
    @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody requestBody, @retrofit2.http.Part
    @org.jetbrains.annotations.NotNull
    okhttp3.MultipartBody.Part part);
}