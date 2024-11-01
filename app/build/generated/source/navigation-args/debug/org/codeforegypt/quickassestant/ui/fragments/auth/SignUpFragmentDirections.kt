package org.codeforegypt.quickassestant.ui.fragments.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class SignUpFragmentDirections private constructor() {
  public companion object {
    public fun actionSignUpFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpFragment_to_mainFragment)
  }
}
