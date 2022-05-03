package dev.wendyyanto.androidmultimodule

import android.app.Application
import dev.wendyyanto.androidmultimodule.di.AppComponentProvider
import dev.wendyyanto.androidmultimodule.di.module.AppComponent
import dev.wendyyanto.androidmultimodule.di.module.DaggerAppComponent
import dev.wendyyanto.daggerbridge.component.FeatureComponent

class App : Application(), AppComponentProvider {

  private val appComponent: AppComponent by lazy(LazyThreadSafetyMode.NONE) {
    DaggerAppComponent.builder()
      .application(this@App)
      .build()
  }

  override fun loadAppComponent(): AppComponent {
    return appComponent
  }

  override fun loadFeatureComponent(): FeatureComponent {
    return loadAppComponent()
  }
}