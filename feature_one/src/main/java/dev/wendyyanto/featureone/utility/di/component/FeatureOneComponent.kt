package dev.wendyyanto.featureone.utility.di.component

import dagger.Subcomponent
import dev.wendyyanto.featureone.FeatureOneActivity
import dev.wendyyanto.featureone.utility.di.module.UtilityModule
import dev.wendyyanto.featureone.utility.di.scope.FeatureOneScope

@FeatureOneScope
@Subcomponent(modules = [UtilityModule::class])
interface FeatureOneComponent {

  fun inject(featureOneActivity: FeatureOneActivity)
}