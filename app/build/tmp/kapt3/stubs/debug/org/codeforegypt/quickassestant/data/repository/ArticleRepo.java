package org.codeforegypt.quickassestant.data.repository;

import org.codeforegypt.quickassestant.api.ArticlesApi;
import org.codeforegypt.quickassestant.data.db.ArticleDao;
import org.codeforegypt.quickassestant.data.model.Article;
import org.codeforegypt.quickassestant.domain.repository.IArticleRepo;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lorg/codeforegypt/quickassestant/data/repository/ArticleRepo;", "Lorg/codeforegypt/quickassestant/domain/repository/IArticleRepo;", "articleApi", "Lorg/codeforegypt/quickassestant/api/ArticlesApi;", "articleDao", "Lorg/codeforegypt/quickassestant/data/db/ArticleDao;", "(Lorg/codeforegypt/quickassestant/api/ArticlesApi;Lorg/codeforegypt/quickassestant/data/db/ArticleDao;)V", "getArticles", "", "Lorg/codeforegypt/quickassestant/data/model/Article;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ArticleRepo implements org.codeforegypt.quickassestant.domain.repository.IArticleRepo {
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.api.ArticlesApi articleApi = null;
    @org.jetbrains.annotations.NotNull
    private final org.codeforegypt.quickassestant.data.db.ArticleDao articleDao = null;
    
    @javax.inject.Inject
    public ArticleRepo(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.api.ArticlesApi articleApi, @org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.data.db.ArticleDao articleDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getArticles(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<org.codeforegypt.quickassestant.data.model.Article>> $completion) {
        return null;
    }
}