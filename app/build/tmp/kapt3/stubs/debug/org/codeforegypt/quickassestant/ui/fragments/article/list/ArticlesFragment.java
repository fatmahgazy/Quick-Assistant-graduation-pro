package org.codeforegypt.quickassestant.ui.fragments.article.list;

import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import dagger.hilt.android.AndroidEntryPoint;
import org.codeforegypt.quickassestant.R;
import org.codeforegypt.quickassestant.databinding.FragmentArticelsBinding;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/article/list/ArticlesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/codeforegypt/quickassestant/databinding/FragmentArticelsBinding;", "articleViewModel", "Lorg/codeforegypt/quickassestant/ui/fragments/article/list/ArticleViewModel;", "getArticleViewModel", "()Lorg/codeforegypt/quickassestant/ui/fragments/article/list/ArticleViewModel;", "articleViewModel$delegate", "Lkotlin/Lazy;", "articlesAdapter", "Lorg/codeforegypt/quickassestant/ui/fragments/article/list/ArticleAdapter;", "binding", "getBinding", "()Lorg/codeforegypt/quickassestant/databinding/FragmentArticelsBinding;", "createChip", "Lcom/google/android/material/chip/Chip;", "type", "", "initArticlesList", "", "initChips", "observeLoading", "observeOfArticles", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showLoading", "visible", "", "app_debug"})
public final class ArticlesFragment extends androidx.fragment.app.Fragment {
    private org.codeforegypt.quickassestant.ui.fragments.article.list.ArticleAdapter articlesAdapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy articleViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private org.codeforegypt.quickassestant.databinding.FragmentArticelsBinding _binding;
    
    public ArticlesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.codeforegypt.quickassestant.ui.fragments.article.list.ArticleViewModel getArticleViewModel() {
        return null;
    }
    
    private final org.codeforegypt.quickassestant.databinding.FragmentArticelsBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initChips() {
    }
    
    private final void initArticlesList() {
    }
    
    private final com.google.android.material.chip.Chip createChip(java.lang.String type) {
        return null;
    }
    
    private final void observeOfArticles() {
    }
    
    private final void observeLoading() {
    }
    
    private final void showLoading(boolean visible) {
    }
}