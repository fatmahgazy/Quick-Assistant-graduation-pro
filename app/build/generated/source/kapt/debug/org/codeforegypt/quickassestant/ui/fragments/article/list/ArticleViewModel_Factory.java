// Generated by Dagger (https://dagger.dev).
package org.codeforegypt.quickassestant.ui.fragments.article.list;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.codeforegypt.quickassestant.domain.repository.IArticleRepo;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ArticleViewModel_Factory implements Factory<ArticleViewModel> {
  private final Provider<IArticleRepo> articleRepoProvider;

  public ArticleViewModel_Factory(Provider<IArticleRepo> articleRepoProvider) {
    this.articleRepoProvider = articleRepoProvider;
  }

  @Override
  public ArticleViewModel get() {
    return newInstance(articleRepoProvider.get());
  }

  public static ArticleViewModel_Factory create(Provider<IArticleRepo> articleRepoProvider) {
    return new ArticleViewModel_Factory(articleRepoProvider);
  }

  public static ArticleViewModel newInstance(IArticleRepo articleRepo) {
    return new ArticleViewModel(articleRepo);
  }
}
