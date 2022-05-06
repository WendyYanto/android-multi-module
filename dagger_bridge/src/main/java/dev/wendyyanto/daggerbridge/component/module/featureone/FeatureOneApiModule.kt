package dev.wendyyanto.daggerbridge.component.module.featureone

import dagger.Binds
import dagger.Module
import dev.wendyyanto.feature_one_api.FeatureOneUtility
import dev.wendyyanto.featureone.utility.FeatureOneUtilityImpl
import dev.wendyyanto.featureone.utility.di.scope.FeatureOneScope

@Module
interface FeatureOneApiModule {

  @FeatureOneScope
  @Binds
  fun bindsFeatureOneUtility(featureOneUtility: FeatureOneUtilityImpl): FeatureOneUtility
}