// Generated by Dagger (https://dagger.dev).
package org.codeforegypt.quickassestant.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.codeforegypt.quickassestant.data.db.UserDao;
import org.codeforegypt.quickassestant.data.db.UserDatabase;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AppModule_ProvideDaoFactory implements Factory<UserDao> {
  private final Provider<UserDatabase> dbProvider;

  public AppModule_ProvideDaoFactory(Provider<UserDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public UserDao get() {
    return provideDao(dbProvider.get());
  }

  public static AppModule_ProvideDaoFactory create(Provider<UserDatabase> dbProvider) {
    return new AppModule_ProvideDaoFactory(dbProvider);
  }

  public static UserDao provideDao(UserDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDao(db));
  }
}