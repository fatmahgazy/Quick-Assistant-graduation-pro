package org.codeforegypt.quickassestant.ui.fragments.contacts

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class ContactsPagerFragmentDirections private constructor() {
  public companion object {
    public fun actionContactsPagerFragmentToAddContactFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_contactsPagerFragment_to_addContactFragment)
  }
}
