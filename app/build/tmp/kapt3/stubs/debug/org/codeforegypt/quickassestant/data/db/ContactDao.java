package org.codeforegypt.quickassestant.data.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import org.codeforegypt.quickassestant.data.model.Contact;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'\u00a8\u0006\f"}, d2 = {"Lorg/codeforegypt/quickassestant/data/db/ContactDao;", "", "deleteAllContacts", "", "deleteContact", "contact", "Lorg/codeforegypt/quickassestant/data/model/Contact;", "getAllContacts", "", "insertContact", "insertContacts", "contacts", "app_debug"})
@androidx.room.Dao
public abstract interface ContactDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertContact(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.Contact contact);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertContacts(@org.jetbrains.annotations.NotNull
    java.util.List<org.codeforegypt.quickassestant.data.model.Contact> contacts);
    
    @androidx.room.Query(value = "SELECT * FROM Contact")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<org.codeforegypt.quickassestant.data.model.Contact> getAllContacts();
    
    @androidx.room.Query(value = "DELETE FROM Contact")
    public abstract void deleteAllContacts();
    
    @androidx.room.Delete
    public abstract void deleteContact(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.Contact contact);
}