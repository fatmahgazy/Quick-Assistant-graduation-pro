package org.codeforegypt.quickassestant.ui.fragments.article.list

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import org.codeforegypt.quickassestant.R
import org.codeforegypt.quickassestant.`data`.model.Article

public class ArticlesFragmentDirections private constructor() {
  private data class ActionArticlesFragmentToArticleFragment(
    public val article: Article,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_articlesFragment_to_articleFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
          result.putParcelable("article", this.article as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
          result.putSerializable("article", this.article as Serializable)
        } else {
          throw UnsupportedOperationException(Article::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionArticlesFragmentToArticleFragment(article: Article): NavDirections =
        ActionArticlesFragmentToArticleFragment(article)
  }
}
