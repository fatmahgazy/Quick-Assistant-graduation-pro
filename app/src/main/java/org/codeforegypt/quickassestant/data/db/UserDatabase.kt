package org.codeforegypt.quickassestant.data.db

import android.content.Context
import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import org.codeforegypt.quickassestant.data.model.Article
import org.codeforegypt.quickassestant.data.model.Contact
import org.codeforegypt.quickassestant.data.model.User
import org.codeforegypt.quickassestant.other.Constants.USER_DATABASE_NAME

@Database(
    entities = [User::class,Contact::class, Article::class],
    version = 2

)

abstract class UserDatabase: RoomDatabase() {


        companion object {
            val MIGRATION_1_2 = object : Migration(1, 2) {
                override fun migrate(database: SupportSQLiteDatabase) {
                    database.execSQL("ALTER TABLE User ADD COLUMN imgUrl TEXT NOT NULL DEFAULT ''")
                }
            }

            fun get(context: Context): UserDatabase {
                return Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    USER_DATABASE_NAME
                ).addMigrations(MIGRATION_1_2).build()


            }
        }


    abstract fun getUserDao(): UserDao
    abstract fun getArticleDao(): ArticleDao
    abstract fun getContactDao(): ContactDao
}