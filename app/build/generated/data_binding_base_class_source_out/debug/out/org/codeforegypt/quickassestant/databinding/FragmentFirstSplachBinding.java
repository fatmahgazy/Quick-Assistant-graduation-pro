// Generated by view binder compiler. Do not edit!
package org.codeforegypt.quickassestant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.codeforegypt.quickassestant.R;

public final class FragmentFirstSplachBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnNext;

  @NonNull
  public final FrameLayout flLoading;

  private FragmentFirstSplachBinding(@NonNull FrameLayout rootView, @NonNull Button btnNext,
      @NonNull FrameLayout flLoading) {
    this.rootView = rootView;
    this.btnNext = btnNext;
    this.flLoading = flLoading;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstSplachBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstSplachBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first_splach, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstSplachBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnNext;
      Button btnNext = ViewBindings.findChildViewById(rootView, id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.flLoading;
      FrameLayout flLoading = ViewBindings.findChildViewById(rootView, id);
      if (flLoading == null) {
        break missingId;
      }

      return new FragmentFirstSplachBinding((FrameLayout) rootView, btnNext, flLoading);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}