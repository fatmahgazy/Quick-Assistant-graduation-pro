// Generated by Dagger (https://dagger.dev).
package org.codeforegypt.quickassestant.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.codeforegypt.quickassestant.api.EmergencyApi;
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
public final class EmergencyRepo_Factory implements Factory<EmergencyRepo> {
  private final Provider<EmergencyApi> emergencyApiProvider;

  private final Provider<UserDao> userProvider;

  public EmergencyRepo_Factory(Provider<EmergencyApi> emergencyApiProvider,
      Provider<UserDao> userProvider) {
    this.emergencyApiProvider = emergencyApiProvider;
    this.userProvider = userProvider;
  }

  @Override
  public EmergencyRepo get() {
    return newInstance(emergencyApiProvider.get(), userProvider.get());
  }

  public static EmergencyRepo_Factory create(Provider<EmergencyApi> emergencyApiProvider,
      Provider<UserDao> userProvider) {
    return new EmergencyRepo_Factory(emergencyApiProvider, userProvider);
  }

  public static EmergencyRepo newInstance(EmergencyApi emergencyApi, UserDao user) {
    return new EmergencyRepo(emergencyApi, user);
  }
}
