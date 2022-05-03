package dev.wendyyanto.androidmultimodule.di

import dev.wendyyanto.androidmultimodule.di.module.AppComponent
import dev.wendyyanto.featureone.utility.di.FeatureOneComponentProvider
import dev.wendyyanto.featureone.utility.di.component.FeatureOneComponent
import dev.wendyyanto.featuretwo.utility.di.FeatureTwoComponentProvider
import dev.wendyyanto.featuretwo.utility.di.component.FeatureTwoComponent

interface ComponentProvider : FeatureOneComponentProvider, FeatureTwoComponentProvider {

  fun loadAppComponent(): AppComponent

  override fun loadFeatureOneComponent(): FeatureOneComponent =
    loadAppComponent().featureOneComponent()

  override fun loadFeatureTwoComponent(): FeatureTwoComponent =
    loadAppComponent().featureTwoComponent()
}