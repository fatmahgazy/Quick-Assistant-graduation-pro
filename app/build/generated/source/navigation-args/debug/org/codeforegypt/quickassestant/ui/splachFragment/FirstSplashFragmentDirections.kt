package org.codeforegypt.quickassestant.ui.splachFragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class FirstSplashFragmentDirections private constructor() {
  public companion object {
    public fun actionFirstSplachFragmentToMainFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstSplachFragment_to_mainFragment2)

    public fun actionFirstSplachFragmentToSecondFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstSplachFragment_to_secondFragment)

    public fun actionFirstSplachFragmentToLogInFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstSplachFragment_to_logInFragment)

    public fun actionFirstSplachFragmentSelf2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstSplachFragment_self2)

    public fun actionFirstSplachFragmentToLogInFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstSplachFragment_to_logInFragment2)
  }
}
