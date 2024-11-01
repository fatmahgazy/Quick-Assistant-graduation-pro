package org.codeforegypt.quickassestant.ui.fragments.contacts

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.codeforegypt.quickassestant.R

public class ContactsFragmentDirections private constructor() {
  public companion object {
    public fun actionContactsFragment2ToAddContactFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_contactsFragment2_to_addContactFragment)
  }
}
