package org.codeforegypt.quickassestant.ui.splachFragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class secondFragmentDirections private constructor() {
  public companion object {
    public fun actionSecondFragmentToThirdFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_secondFragment_to_thirdFragment)
  }
}
