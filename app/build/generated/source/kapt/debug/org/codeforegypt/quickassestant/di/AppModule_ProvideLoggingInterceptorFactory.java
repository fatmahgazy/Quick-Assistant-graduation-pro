// Generated by Dagger (https://dagger.dev).
package org.codeforegypt.quickassestant.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.logging.HttpLoggingInterceptor;

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
public final class AppModule_ProvideLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return provideLoggingInterceptor();
  }

  public static AppModule_ProvideLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor provideLoggingInterceptor() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLoggingInterceptor());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideLoggingInterceptorFactory INSTANCE = new AppModule_ProvideLoggingInterceptorFactory();
  }
}
