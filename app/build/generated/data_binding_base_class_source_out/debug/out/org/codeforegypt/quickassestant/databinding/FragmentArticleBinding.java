// Generated by view binder compiler. Do not edit!
package org.codeforegypt.quickassestant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.codeforegypt.quickassestant.R;

public final class FragmentArticleBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView Image;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final FrameLayout flLoading;

  @NonNull
  public final ImageView ivReturn;

  @NonNull
  public final TextView tvContent;

  @NonNull
  public final TextView tvScreenName;

  @NonNull
  public final TextView tvTitle;

  private FragmentArticleBinding(@NonNull FrameLayout rootView, @NonNull ImageView Image,
      @NonNull CardView cardView, @NonNull FrameLayout flLoading, @NonNull ImageView ivReturn,
      @NonNull TextView tvContent, @NonNull TextView tvScreenName, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.Image = Image;
    this.cardView = cardView;
    this.flLoading = flLoading;
    this.ivReturn = ivReturn;
    this.tvContent = tvContent;
    this.tvScreenName = tvScreenName;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_article, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentArticleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Image;
      ImageView Image = ViewBindings.findChildViewById(rootView, id);
      if (Image == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.flLoading;
      FrameLayout flLoading = ViewBindings.findChildViewById(rootView, id);
      if (flLoading == null) {
        break missingId;
      }

      id = R.id.ivReturn;
      ImageView ivReturn = ViewBindings.findChildViewById(rootView, id);
      if (ivReturn == null) {
        break missingId;
      }

      id = R.id.tvContent;
      TextView tvContent = ViewBindings.findChildViewById(rootView, id);
      if (tvContent == null) {
        break missingId;
      }

      id = R.id.tvScreenName;
      TextView tvScreenName = ViewBindings.findChildViewById(rootView, id);
      if (tvScreenName == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new FragmentArticleBinding((FrameLayout) rootView, Image, cardView, flLoading,
          ivReturn, tvContent, tvScreenName, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
