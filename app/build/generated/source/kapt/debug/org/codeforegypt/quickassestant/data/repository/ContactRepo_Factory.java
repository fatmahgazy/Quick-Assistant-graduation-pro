// Generated by Dagger (https://dagger.dev).
package org.codeforegypt.quickassestant.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.codeforegypt.quickassestant.api.ContactsApi;
import org.codeforegypt.quickassestant.data.db.ContactDao;
import org.codeforegypt.quickassestant.data.db.UserDao;

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
public final class ContactRepo_Factory implements Factory<ContactRepo> {
  private final Provider<ContactsApi> contactsApiProvider;

  private final Provider<UserDao> userDaoProvider;

  private final Provider<ContactDao> contactDaoProvider;

  public ContactRepo_Factory(Provider<ContactsApi> contactsApiProvider,
      Provider<UserDao> userDaoProvider, Provider<ContactDao> contactDaoProvider) {
    this.contactsApiProvider = contactsApiProvider;
    this.userDaoProvider = userDaoProvider;
    this.contactDaoProvider = contactDaoProvider;
  }

  @Override
  public ContactRepo get() {
    return newInstance(contactsApiProvider.get(), userDaoProvider.get(), contactDaoProvider.get());
  }

  public static ContactRepo_Factory create(Provider<ContactsApi> contactsApiProvider,
      Provider<UserDao> userDaoProvider, Provider<ContactDao> contactDaoProvider) {
    return new ContactRepo_Factory(contactsApiProvider, userDaoProvider, contactDaoProvider);
  }

  public static ContactRepo newInstance(ContactsApi contactsApi, UserDao userDao,
      ContactDao contactDao) {
    return new ContactRepo(contactsApi, userDao, contactDao);
  }
}