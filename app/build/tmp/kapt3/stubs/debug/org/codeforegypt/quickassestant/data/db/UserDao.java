package org.codeforegypt.quickassestant.data.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import org.codeforegypt.quickassestant.data.model.User;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\u0006H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lorg/codeforegypt/quickassestant/data/db/UserDao;", "", "deleteAllUsers", "", "deleteUser", "user", "Lorg/codeforegypt/quickassestant/data/model/User;", "getUser", "getUsers", "", "insertUser", "updateUser", "app_debug"})
@androidx.room.Dao
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertUser(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.User user);
    
    @androidx.room.Delete
    public abstract void deleteUser(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.User user);
    
    @androidx.room.Update
    public abstract void updateUser(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.User user);
    
    @androidx.room.Query(value = "SELECT * FROM User")
    @org.jetbrains.annotations.NotNull
    public abstract org.codeforegypt.quickassestant.data.model.User getUser();
    
    @androidx.room.Query(value = "SELECT * FROM User")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<org.codeforegypt.quickassestant.data.model.User> getUsers();
    
    @androidx.room.Query(value = "DELETE FROM User")
    public abstract void deleteAllUsers();
}