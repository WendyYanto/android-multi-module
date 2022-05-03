package dev.wendyyanto.androidmultimodule.di.module

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dev.wendyyanto.androidmultimodule.MainActivity
import dev.wendyyanto.daggerbridge.component.FeatureComponent
import dev.wendyyanto.daggerbridge.component.module.FeatureApiModule
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilityModule::class, FeatureApiModule::class])
interface AppComponent : FeatureComponent {

  fun inject(mainActivity: MainActivity)

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(application: Application): Builder

    fun build(): AppComponent
  }
}