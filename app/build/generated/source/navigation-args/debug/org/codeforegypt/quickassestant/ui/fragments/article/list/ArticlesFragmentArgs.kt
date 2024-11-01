package org.codeforegypt.quickassestant.ui.fragments.article.list

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.codeforegypt.quickassestant.`data`.model.Article

public data class ArticlesFragmentArgs(
  public val article: Article? = null,
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
      result.putParcelable("article", this.article as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
      result.putSerializable("article", this.article as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
      result.set("article", this.article as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
      result.set("article", this.article as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): ArticlesFragmentArgs {
      bundle.setClassLoader(ArticlesFragmentArgs::class.java.classLoader)
      val __article : Article?
      if (bundle.containsKey("article")) {
        if (Parcelable::class.java.isAssignableFrom(Article::class.java) ||
            Serializable::class.java.isAssignableFrom(Article::class.java)) {
          __article = bundle.get("article") as Article?
        } else {
          throw UnsupportedOperationException(Article::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __article = null
      }
      return ArticlesFragmentArgs(__article)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ArticlesFragmentArgs {
      val __article : Article?
      if (savedStateHandle.contains("article")) {
        if (Parcelable::class.java.isAssignableFrom(Article::class.java) ||
            Serializable::class.java.isAssignableFrom(Article::class.java)) {
          __article = savedStateHandle.get<Article?>("article")
        } else {
          throw UnsupportedOperationException(Article::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __article = null
      }
      return ArticlesFragmentArgs(__article)
    }
  }
}
