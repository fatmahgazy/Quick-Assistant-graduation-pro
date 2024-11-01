package org.codeforegypt.quickassestant.api;

import kotlinx.coroutines.Deferred;
import org.codeforegypt.quickassestant.data.model.Article;
import org.codeforegypt.quickassestant.data.model.Articles;
import retrofit2.Response;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lorg/codeforegypt/quickassestant/api/ArticlesApi;", "", "getArticles", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lorg/codeforegypt/quickassestant/data/model/Articles;", "app_debug"})
public abstract interface ArticlesApi {
    
    @retrofit2.http.GET(value = "data/articles")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<org.codeforegypt.quickassestant.data.model.Articles>> getArticles();
}