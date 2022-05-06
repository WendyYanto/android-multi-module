package dev.wendyyanto.featuretwo.utility.di.module

import dagger.Module
import dagger.Provides
import dev.wendyyanto.base.utility.AppUtility
import dev.wendyyanto.feature_one_api.FeatureOneUtility
import dev.wendyyanto.featuretwo.utility.FeatureTwoUtility
import dev.wendyyanto.featuretwo.utility.di.scope.FeatureTwoScope

@Module
object UtilityModule {

  @FeatureTwoScope
  @Provides
  fun provideFeatureOneUtility(
    appUtility: AppUtility,
    featureOneUtility: FeatureOneUtility
  ): FeatureTwoUtility =
    FeatureTwoUtility(appUtility, featureOneUtility)
}