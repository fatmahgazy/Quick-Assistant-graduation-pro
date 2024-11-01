package org.codeforegypt.quickassestant.ui.fragments.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class LogInFragmentDirections private constructor() {
  public companion object {
    public fun actionLogInFragmentToMainFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_logInFragment_to_mainFragment2)

    public fun actionLogInFragmentToSignUpFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_logInFragment_to_signUpFragment)

    public fun actionLogInFragmentToForgotPasswordFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_logInFragment_to_forgotPasswordFragment)
  }
}
