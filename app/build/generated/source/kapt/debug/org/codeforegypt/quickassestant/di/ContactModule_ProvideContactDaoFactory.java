// Generated by Dagger (https://dagger.dev).
package org.codeforegypt.quickassestant.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.codeforegypt.quickassestant.data.db.ContactDao;
import org.codeforegypt.quickassestant.data.db.UserDatabase;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ContactModule_ProvideContactDaoFactory implements Factory<ContactDao> {
  private final Provider<UserDatabase> dbProvider;

  public ContactModule_ProvideContactDaoFactory(Provider<UserDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public ContactDao get() {
    return provideContactDao(dbProvider.get());
  }

  public static ContactModule_ProvideContactDaoFactory create(Provider<UserDatabase> dbProvider) {
    return new ContactModule_ProvideContactDaoFactory(dbProvider);
  }

  public static ContactDao provideContactDao(UserDatabase db) {
    return Preconditions.checkNotNullFromProvides(ContactModule.INSTANCE.provideContactDao(db));
  }
}
