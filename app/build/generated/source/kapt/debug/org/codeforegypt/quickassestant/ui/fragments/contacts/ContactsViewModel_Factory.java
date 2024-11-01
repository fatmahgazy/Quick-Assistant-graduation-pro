// Generated by Dagger (https://dagger.dev).
package org.codeforegypt.quickassestant.ui.fragments.contacts;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.codeforegypt.quickassestant.domain.repository.IContactRepo;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ContactsViewModel_Factory implements Factory<ContactsViewModel> {
  private final Provider<IContactRepo> contactRepoProvider;

  public ContactsViewModel_Factory(Provider<IContactRepo> contactRepoProvider) {
    this.contactRepoProvider = contactRepoProvider;
  }

  @Override
  public ContactsViewModel get() {
    return newInstance(contactRepoProvider.get());
  }

  public static ContactsViewModel_Factory create(Provider<IContactRepo> contactRepoProvider) {
    return new ContactsViewModel_Factory(contactRepoProvider);
  }

  public static ContactsViewModel newInstance(IContactRepo contactRepo) {
    return new ContactsViewModel(contactRepo);
  }
}