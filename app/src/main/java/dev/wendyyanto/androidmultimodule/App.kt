package dev.wendyyanto.androidmultimodule

import android.app.Application
import dev.wendyyanto.androidmultimodule.di.ComponentProvider
import dev.wendyyanto.androidmultimodule.di.module.AppComponent
import dev.wendyyanto.androidmultimodule.di.module.DaggerAppComponent

class App : Application(), ComponentProvider {

  private val appComponent: AppComponent by lazy(LazyThreadSafetyMode.NONE) {
    DaggerAppComponent.builder()
      .application(this@App)
      .build()
  }

  override fun loadAppComponent(): AppComponent {
    return appComponent
  }
}