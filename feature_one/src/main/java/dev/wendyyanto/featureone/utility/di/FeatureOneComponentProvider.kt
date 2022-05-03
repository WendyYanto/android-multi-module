package dev.wendyyanto.featureone.utility.di

import dev.wendyyanto.featureone.utility.di.component.FeatureOneComponent

interface FeatureOneComponentProvider {

  fun loadFeatureOneComponent(): FeatureOneComponent
}