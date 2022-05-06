package dev.wendyyanto.androidmultimodule.di

import dev.wendyyanto.androidmultimodule.di.module.AppComponent
import dev.wendyyanto.daggerbridge.component.FeatureComponentProvider

interface AppComponentProvider : FeatureComponentProvider {

  fun loadAppComponent(): AppComponent
}