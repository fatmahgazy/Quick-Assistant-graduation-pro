// Generated by Dagger (https://dagger.dev).
package org.codeforegypt.quickassestant.ui.fragments.contacts;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ContactsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
  @Override
  public Boolean get() {
    return provide();
  }

  public static ContactsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static boolean provide() {
    return ContactsViewModel_HiltModules.KeyModule.provide();
  }

  private static final class InstanceHolder {
    private static final ContactsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ContactsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
