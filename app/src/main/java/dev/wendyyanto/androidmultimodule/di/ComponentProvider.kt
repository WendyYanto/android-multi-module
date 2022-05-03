package dev.wendyyanto.androidmultimodule.di

import dev.wendyyanto.androidmultimodule.di.module.AppComponent
import dev.wendyyanto.featureone.utility.di.FeatureOneComponentProvider
import dev.wendyyanto.featuretwo.utility.di.FeatureTwoComponentProvider

interface ComponentProvider : FeatureOneComponentProvider, FeatureTwoComponentProvider {

  fun loadAppComponent(): AppComponent
}