package dev.wendyyanto.featureone.utility.di.module

import dagger.Module
import dagger.Provides
import dev.wendyyanto.featureone.utility.FeatureOneUtility
import dev.wendyyanto.featureone.utility.di.scope.FeatureOneScope

@Module
object UtilityModule {

  @FeatureOneScope
  @Provides
  fun provideFeatureOneUtility(): FeatureOneUtility = FeatureOneUtility()
}