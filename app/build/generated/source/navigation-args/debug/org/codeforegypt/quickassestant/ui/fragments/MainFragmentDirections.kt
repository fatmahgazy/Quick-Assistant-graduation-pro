package org.codeforegypt.quickassestant.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress
import org.codeforegypt.quickassestant.R
import org.codeforegypt.quickassestant.`data`.model.Article

public class MainFragmentDirections private constructor() {
  private data class ActionMainFragmentToArticlesFragment(
    public val article: Article? = null,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mainFragment_to_articlesFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
          result.putParcelable("article", this.article as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
          result.putSerializable("article", this.article as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionMainFragmentToMoreFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_moreFragment2)

    public fun actionMainFragmentToContactsPagerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_contactsPagerFragment)

    public fun actionMainFragmentToMoreFragment22(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_moreFragment22)

    public fun actionMainFragmentToArticlesFragment(article: Article? = null): NavDirections =
        ActionMainFragmentToArticlesFragment(article)

    public fun actionMainFragmentToPublishReportFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_publishReportFragment)
  }
}
