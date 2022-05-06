package dev.wendyyanto.daggerbridge.component

import dev.wendyyanto.featureone.utility.di.component.FeatureOneComponent
import dev.wendyyanto.featuretwo.utility.di.component.FeatureTwoComponent

interface FeatureComponent {

  fun featureOneComponent(): FeatureOneComponent

  fun featureTwoComponent(): FeatureTwoComponent
}