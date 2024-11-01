package org.codeforegypt.quickassestant.api;

import kotlinx.coroutines.Deferred;
import org.codeforegypt.quickassestant.data.model.ModifyContact;
import org.codeforegypt.quickassestant.data.model.Contact;
import org.codeforegypt.quickassestant.data.model.Contacts;
import org.codeforegypt.quickassestant.data.model.DeleteContactResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H\'J2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H\'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u0007H\'\u00a8\u0006\u000e"}, d2 = {"Lorg/codeforegypt/quickassestant/api/ContactsApi;", "", "addContact", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lorg/codeforegypt/quickassestant/data/model/Contact;", "name", "", "phone", "email", "deleteContact", "Lorg/codeforegypt/quickassestant/data/model/DeleteContactResponse;", "getContacts", "Lorg/codeforegypt/quickassestant/data/model/Contacts;", "app_debug"})
public abstract interface ContactsApi {
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "phone/Add")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.Contact>> addContact(@retrofit2.http.Field(value = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @retrofit2.http.Field(value = "phone")
    @org.jetbrains.annotations.NotNull
    java.lang.String phone, @retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    @retrofit2.http.GET(value = "phone/get")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.Contacts>> getContacts(@retrofit2.http.Query(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "phone/Delete")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.DeleteContactResponse>> deleteContact(@retrofit2.http.Field(value = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @retrofit2.http.Field(value = "phone")
    @org.jetbrains.annotations.NotNull
    java.lang.String phone, @retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email);
}