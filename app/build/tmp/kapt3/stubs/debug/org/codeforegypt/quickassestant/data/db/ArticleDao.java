package org.codeforegypt.quickassestant.data.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import org.codeforegypt.quickassestant.data.model.Article;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\b"}, d2 = {"Lorg/codeforegypt/quickassestant/data/db/ArticleDao;", "", "getAllArticles", "", "Lorg/codeforegypt/quickassestant/data/model/Article;", "insertArticle", "", "article", "app_debug"})
@androidx.room.Dao
public abstract interface ArticleDao {
    
    @androidx.room.Insert
    public abstract void insertArticle(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.model.Article article);
    
    @androidx.room.Query(value = "SELECT * FROM Article")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<org.codeforegypt.quickassestant.data.model.Article> getAllArticles();
}