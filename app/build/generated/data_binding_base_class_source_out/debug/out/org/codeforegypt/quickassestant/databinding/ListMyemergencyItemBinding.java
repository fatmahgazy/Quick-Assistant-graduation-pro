// Generated by view binder compiler. Do not edit!
package org.codeforegypt.quickassestant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ListMyemergencyItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button btnLocation;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvProblem;

  private ListMyemergencyItemBinding(@NonNull CardView rootView, @NonNull Button btnLocation,
      @NonNull TextView tvDate, @NonNull TextView tvProblem) {
    this.rootView = rootView;
    this.btnLocation = btnLocation;
    this.tvDate = tvDate;
    this.tvProblem = tvProblem;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ListMyemergencyItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListMyemergencyItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_myemergency_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListMyemergencyItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLocation;
      Button btnLocation = ViewBindings.findChildViewById(rootView, id);
      if (btnLocation == null) {
        break missingId;
      }

      id = R.id.tvDate;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvProblem;
      TextView tvProblem = ViewBindings.findChildViewById(rootView, id);
      if (tvProblem == null) {
        break missingId;
      }

      return new ListMyemergencyItemBinding((CardView) rootView, btnLocation, tvDate, tvProblem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}