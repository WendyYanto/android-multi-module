package dev.wendyyanto.androidmultimodule.di.module

import dagger.Binds
import dagger.Module
import dev.wendyyanto.androidmultimodule.utility.AppUtilityImpl
import dev.wendyyanto.base.utility.AppUtility
import javax.inject.Singleton

@Module
interface UtilityModule {

  @Singleton
  @Binds
  fun provideAppUtility(appUtilityImpl: AppUtilityImpl): AppUtility
}