package dev.wendyyanto.androidmultimodule.di.module

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dev.wendyyanto.androidmultimodule.MainActivity
import dev.wendyyanto.featureone.utility.di.component.FeatureOneComponent
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilityModule::class])
interface AppComponent {

  fun inject(mainActivity: MainActivity)

  fun featureOneComponent(): FeatureOneComponent

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(application: Application): Builder

    fun build(): AppComponent
  }
}