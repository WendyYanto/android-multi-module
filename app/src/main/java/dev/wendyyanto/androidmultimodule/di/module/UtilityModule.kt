package dev.wendyyanto.androidmultimodule.di.module

import dagger.Module
import dev.wendyyanto.androidmultimodule.utility.AppUtility

@Module
object UtilityModule {

  fun provideAppUtility(): AppUtility = AppUtility()
}