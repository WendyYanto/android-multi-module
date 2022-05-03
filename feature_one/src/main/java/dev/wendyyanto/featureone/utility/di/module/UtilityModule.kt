package dev.wendyyanto.featureone.utility.di.module

import dagger.Binds
import dagger.Module
import dev.wendyyanto.feature_one_api.FeatureOneUtility
import dev.wendyyanto.featureone.utility.FeatureOneUtilityImpl
import dev.wendyyanto.featureone.utility.di.scope.FeatureOneScope

@Module
interface UtilityModule {

  @FeatureOneScope
  @Binds
  fun bindsFeatureOneUtility(featureOneUtility: FeatureOneUtilityImpl): FeatureOneUtility
}