package dev.wendyyanto.featuretwo.utility.di

import dev.wendyyanto.featuretwo.utility.di.component.FeatureTwoComponent

interface FeatureTwoComponentProvider {

  fun loadFeatureTwoComponent(): FeatureTwoComponent
}