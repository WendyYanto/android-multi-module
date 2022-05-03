package dev.wendyyanto.featuretwo.utility.di.component

import dagger.Subcomponent
import dev.wendyyanto.featuretwo.utility.di.module.UtilityModule
import dev.wendyyanto.featuretwo.FeatureTwoActivity
import dev.wendyyanto.featuretwo.utility.di.scope.FeatureTwoScope

@FeatureTwoScope
@Subcomponent(modules = [UtilityModule::class])
interface FeatureTwoComponent {

  fun inject(featureTwoActivity: FeatureTwoActivity)
}