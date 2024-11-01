package org.codeforegypt.quickassestant.data.db;

import android.content.Context;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.codeforegypt.quickassestant.data.model.Article;
import org.codeforegypt.quickassestant.data.model.Contact;
import org.codeforegypt.quickassestant.data.model.User;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lorg/codeforegypt/quickassestant/data/db/UserDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getArticleDao", "Lorg/codeforegypt/quickassestant/data/db/ArticleDao;", "getContactDao", "Lorg/codeforegypt/quickassestant/data/db/ContactDao;", "getUserDao", "Lorg/codeforegypt/quickassestant/data/db/UserDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {org.codeforegypt.quickassestant.data.model.User.class, org.codeforegypt.quickassestant.data.model.Contact.class, org.codeforegypt.quickassestant.data.model.Article.class}, version = 2)
public abstract class UserDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    @org.jetbrains.annotations.NotNull
    public static final org.codeforegypt.quickassestant.data.db.UserDatabase.Companion Companion = null;
    
    public UserDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract org.codeforegypt.quickassestant.data.db.UserDao getUserDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract org.codeforegypt.quickassestant.data.db.ArticleDao getArticleDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract org.codeforegypt.quickassestant.data.db.ContactDao getContactDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/codeforegypt/quickassestant/data/db/UserDatabase$Companion;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "get", "Lorg/codeforegypt/quickassestant/data/db/UserDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.room.migration.Migration getMIGRATION_1_2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.codeforegypt.quickassestant.data.db.UserDatabase get(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}