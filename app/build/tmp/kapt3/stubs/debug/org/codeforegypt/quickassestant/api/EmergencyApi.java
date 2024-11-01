package org.codeforegypt.quickassestant.api;

import kotlinx.coroutines.Deferred;
import org.codeforegypt.quickassestant.data.model.Emergency;
import org.codeforegypt.quickassestant.data.model.EmergencyReport;
import org.codeforegypt.quickassestant.data.model.Phone;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\u0011"}, d2 = {"Lorg/codeforegypt/quickassestant/api/EmergencyApi;", "", "addEmergency", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Ljava/lang/Void;", "email", "", "latitude", "", "longitude", "message", "getEmergencies", "Lorg/codeforegypt/quickassestant/data/model/EmergencyReport;", "phone", "getMyEmergency", "sendNotification", "app_debug"})
public abstract interface EmergencyApi {
    
    @retrofit2.http.GET(value = "report/repo")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.EmergencyReport>> getEmergencies(@retrofit2.http.Query(value = "phone")
    @org.jetbrains.annotations.NotNull
    java.lang.String phone);
    
    @retrofit2.http.GET(value = "report/not")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<java.lang.Void>> sendNotification(@retrofit2.http.Query(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    @retrofit2.http.GET(value = "report/getmyrepo")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.EmergencyReport>> getMyEmergency(@retrofit2.http.Query(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "report/Add")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<java.lang.Void>> addEmergency(@retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email, @retrofit2.http.Field(value = "latitude")
    double latitude, @retrofit2.http.Field(value = "longitude")
    double longitude, @retrofit2.http.Field(value = "message")
    @org.jetbrains.annotations.NotNull
    java.lang.String message);
}