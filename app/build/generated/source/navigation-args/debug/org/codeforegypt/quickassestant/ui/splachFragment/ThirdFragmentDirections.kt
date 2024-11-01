package org.codeforegypt.quickassestant.ui.splachFragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class ThirdFragmentDirections private constructor() {
  public companion object {
    public fun actionThirdFragmentToLogInFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_thirdFragment_to_logInFragment)
  }
}
