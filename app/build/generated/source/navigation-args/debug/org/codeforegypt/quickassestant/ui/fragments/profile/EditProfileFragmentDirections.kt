package org.codeforegypt.quickassestant.ui.fragments.profile

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class EditProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionEditProfileFragmentToChangePasswordFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_editProfileFragment_to_changePasswordFragment)
  }
}
