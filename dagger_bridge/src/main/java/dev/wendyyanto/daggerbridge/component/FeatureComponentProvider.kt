package dev.wendyyanto.daggerbridge.component

import dev.wendyyanto.featureone.utility.di.FeatureOneComponentProvider
import dev.wendyyanto.featureone.utility.di.component.FeatureOneComponent
import dev.wendyyanto.featuretwo.utility.di.FeatureTwoComponentProvider
import dev.wendyyanto.featuretwo.utility.di.component.FeatureTwoComponent

interface FeatureComponentProvider : FeatureOneComponentProvider, FeatureTwoComponentProvider {

  fun loadFeatureComponent(): FeatureComponent

  override fun loadFeatureOneComponent(): FeatureOneComponent =
    loadFeatureComponent().featureOneComponent()

  override fun loadFeatureTwoComponent(): FeatureTwoComponent =
    loadFeatureComponent().featureTwoComponent()
}