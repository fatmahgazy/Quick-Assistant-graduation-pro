package org.codeforegypt.quickassestant.ui.fragments.article.list;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.codeforegypt.quickassestant.databinding.ListArticlesBinding;
import com.bumptech.glide.Glide;
import org.codeforegypt.quickassestant.data.model.Article;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0014\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/article/list/ArticleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/codeforegypt/quickassestant/ui/fragments/article/list/ArticleAdapter$ArticleViewHolder;", "()V", "list", "", "Lorg/codeforegypt/quickassestant/data/model/Article;", "onArticleClicked", "Lkotlin/Function1;", "", "getOnArticleClicked$app_debug", "()Lkotlin/jvm/functions/Function1;", "setOnArticleClicked$app_debug", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newList", "ArticleViewHolder", "app_debug"})
public final class ArticleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.codeforegypt.quickassestant.ui.fragments.article.list.ArticleAdapter.ArticleViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<org.codeforegypt.quickassestant.data.model.Article> list;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Article, kotlin.Unit> onArticleClicked;
    
    public ArticleAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<org.codeforegypt.quickassestant.data.model.Article, kotlin.Unit> getOnArticleClicked$app_debug() {
        return null;
    }
    
    public final void setOnArticleClicked$app_debug(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Article, kotlin.Unit> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.codeforegypt.quickassestant.ui.fragments.article.list.ArticleAdapter.ArticleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.ui.fragments.article.list.ArticleAdapter.ArticleViewHolder holder, int position) {
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull
    java.util.List<org.codeforegypt.quickassestant.data.model.Article> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/article/list/ArticleAdapter$ArticleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/codeforegypt/quickassestant/databinding/ListArticlesBinding;", "(Lorg/codeforegypt/quickassestant/databinding/ListArticlesBinding;)V", "getBinding", "()Lorg/codeforegypt/quickassestant/databinding/ListArticlesBinding;", "bind", "", "article", "Lorg/codeforegypt/quickassestant/data/model/Article;", "onArticleClicked", "Lkotlin/Function1;", "app_debug"})
    public static final class ArticleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.codeforegypt.quickassestant.databinding.ListArticlesBinding binding = null;
        
        public ArticleViewHolder(@org.jetbrains.annotations.NotNull
        org.codeforegypt.quickassestant.databinding.ListArticlesBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.codeforegypt.quickassestant.databinding.ListArticlesBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.codeforegypt.quickassestant.data.model.Article article, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Article, kotlin.Unit> onArticleClicked) {
        }
    }
}