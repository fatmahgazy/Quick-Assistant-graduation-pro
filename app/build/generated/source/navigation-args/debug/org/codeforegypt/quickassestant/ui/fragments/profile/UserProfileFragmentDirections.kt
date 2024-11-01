package org.codeforegypt.quickassestant.ui.fragments.profile

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class UserProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionUserProfileFragmentToEditProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_userProfileFragment_to_editProfileFragment)
  }
}
