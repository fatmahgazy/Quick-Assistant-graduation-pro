package org.codeforegypt.quickassestant.ui.fragments.more

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class MoreFragmentDirections private constructor() {
  public companion object {
    public fun actionMoreFragment2ToUserProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_moreFragment2_to_userProfileFragment)

    public fun actionMoreFragment2ToMyEmergencyFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_moreFragment2_to_myEmergencyFragment)

    public fun actionMoreFragment2ToLogInFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_moreFragment2_to_logInFragment)

    public fun actionMoreFragment2ToFirstSplachFragment3(): NavDirections =
        ActionOnlyNavDirections(R.id.action_moreFragment2_to_firstSplachFragment3)
  }
}
