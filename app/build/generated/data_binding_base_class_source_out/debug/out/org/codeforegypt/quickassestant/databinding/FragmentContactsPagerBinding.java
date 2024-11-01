// Generated by view binder compiler. Do not edit!
package org.codeforegypt.quickassestant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.codeforegypt.quickassestant.R;

public final class FragmentContactsPagerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgAddContact;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final TabLayout tabPager;

  @NonNull
  public final TextView tvScreenName;

  @NonNull
  public final ViewPager2 vpContacts;

  private FragmentContactsPagerBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView imgAddContact, @NonNull ImageView imgBack, @NonNull TabLayout tabPager,
      @NonNull TextView tvScreenName, @NonNull ViewPager2 vpContacts) {
    this.rootView = rootView;
    this.imgAddContact = imgAddContact;
    this.imgBack = imgBack;
    this.tabPager = tabPager;
    this.tvScreenName = tvScreenName;
    this.vpContacts = vpContacts;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentContactsPagerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentContactsPagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_contacts_pager, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentContactsPagerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgAddContact;
      ImageView imgAddContact = ViewBindings.findChildViewById(rootView, id);
      if (imgAddContact == null) {
        break missingId;
      }

      id = R.id.imgBack;
      ImageView imgBack = ViewBindings.findChildViewById(rootView, id);
      if (imgBack == null) {
        break missingId;
      }

      id = R.id.tabPager;
      TabLayout tabPager = ViewBindings.findChildViewById(rootView, id);
      if (tabPager == null) {
        break missingId;
      }

      id = R.id.tvScreenName;
      TextView tvScreenName = ViewBindings.findChildViewById(rootView, id);
      if (tvScreenName == null) {
        break missingId;
      }

      id = R.id.vpContacts;
      ViewPager2 vpContacts = ViewBindings.findChildViewById(rootView, id);
      if (vpContacts == null) {
        break missingId;
      }

      return new FragmentContactsPagerBinding((LinearLayout) rootView, imgAddContact, imgBack,
          tabPager, tvScreenName, vpContacts);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
