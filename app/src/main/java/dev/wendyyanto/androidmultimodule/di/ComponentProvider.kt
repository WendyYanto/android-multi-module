package dev.wendyyanto.androidmultimodule.di

import dev.wendyyanto.androidmultimodule.di.module.AppComponent
import dev.wendyyanto.featureone.utility.di.FeatureOneComponentProvider

interface ComponentProvider : FeatureOneComponentProvider {

  fun loadAppComponent(): AppComponent
}