package dev.wendyyanto.androidmultimodule.di.module

import dagger.Binds
import dagger.Module
import dev.wendyyanto.androidmultimodule.utility.AppUtilityImpl
import dev.wendyyanto.base.utility.AppUtility
import dev.wendyyanto.feature_one_api.FeatureOneUtility
import dev.wendyyanto.featureone.utility.FeatureOneUtilityImpl
import dev.wendyyanto.featureone.utility.di.scope.FeatureOneScope
import javax.inject.Singleton

@Module
interface UtilityModule {

  @Singleton
  @Binds
  fun provideAppUtility(appUtilityImpl: AppUtilityImpl): AppUtility

  @FeatureOneScope
  @Binds
  fun bindsFeatureOneUtility(featureOneUtility: FeatureOneUtilityImpl): FeatureOneUtility
}