package org.codeforegypt.quickassestant;

import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.HiltWrapper_SavedStateHandleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;
import org.codeforegypt.quickassestant.di.AppModule;
import org.codeforegypt.quickassestant.di.ArticleModule;
import org.codeforegypt.quickassestant.di.ContactModule;
import org.codeforegypt.quickassestant.di.EmergencyModule;
import org.codeforegypt.quickassestant.di.ProfileModule;
import org.codeforegypt.quickassestant.ui.MainActivity_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.ChangePasswordFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.MainFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.article.ArticleFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.article.list.ArticleViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.article.list.ArticlesFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.auth.LogInFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.auth.LogInViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.auth.SignUpFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.auth.SignUpViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.auth.password.ForgotPasswordFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.auth.password.ForgotPasswordViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.contacts.ContactFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.contacts.ContactViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.contacts.ContactsFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.contacts.ContactsViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.add.AddEmergencyViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.add.PublishReportFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyViewModule_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.myemergency.MyEmergencyFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.emergencies.myemergency.MyEmergencyViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.more.MoreFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.more.MoreViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.profile.EditProfileFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.profile.EditProfileViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.fragments.profile.UserProfileFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.fragments.profile.UserProfileViewModel_HiltModules;
import org.codeforegypt.quickassestant.ui.splachFragment.FirstSplashFragment_GeneratedInjector;
import org.codeforegypt.quickassestant.ui.splachFragment.FirstSplashViewModel_HiltModules;

public final class EmergencyApp_HiltComponents {
  private EmergencyApp_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          AppModule.class,
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent,
      EmergencyApp_GeneratedInjector {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddEmergencyViewModel_HiltModules.KeyModule.class,
          ArticleModule.class,
          ArticleViewModel_HiltModules.KeyModule.class,
          ContactModule.class,
          ContactViewModel_HiltModules.KeyModule.class,
          ContactsViewModel_HiltModules.KeyModule.class,
          EditProfileViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          EmergencyModule.class,
          EmergencyViewModule_HiltModules.KeyModule.class,
          FirstSplashViewModel_HiltModules.KeyModule.class,
          ForgotPasswordViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          HiltWrapper_SavedStateHandleModule.class,
          LogInViewModel_HiltModules.KeyModule.class,
          MoreViewModel_HiltModules.KeyModule.class,
          MyEmergencyViewModel_HiltModules.KeyModule.class,
          ProfileModule.class,
          SignUpViewModel_HiltModules.KeyModule.class,
          UserProfileViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent,
      MainActivity_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddEmergencyViewModel_HiltModules.BindsModule.class,
          ArticleViewModel_HiltModules.BindsModule.class,
          ContactViewModel_HiltModules.BindsModule.class,
          ContactsViewModel_HiltModules.BindsModule.class,
          EditProfileViewModel_HiltModules.BindsModule.class,
          EmergencyViewModule_HiltModules.BindsModule.class,
          FirstSplashViewModel_HiltModules.BindsModule.class,
          ForgotPasswordViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          LogInViewModel_HiltModules.BindsModule.class,
          MoreViewModel_HiltModules.BindsModule.class,
          MyEmergencyViewModel_HiltModules.BindsModule.class,
          SignUpViewModel_HiltModules.BindsModule.class,
          UserProfileViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent,
      ChangePasswordFragment_GeneratedInjector,
      MainFragment_GeneratedInjector,
      ArticleFragment_GeneratedInjector,
      ArticlesFragment_GeneratedInjector,
      LogInFragment_GeneratedInjector,
      SignUpFragment_GeneratedInjector,
      ForgotPasswordFragment_GeneratedInjector,
      ContactFragment_GeneratedInjector,
      ContactsFragment_GeneratedInjector,
      PublishReportFragment_GeneratedInjector,
      EmergencyFragment_GeneratedInjector,
      MyEmergencyFragment_GeneratedInjector,
      MoreFragment_GeneratedInjector,
      EditProfileFragment_GeneratedInjector,
      UserProfileFragment_GeneratedInjector,
      FirstSplashFragment_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
