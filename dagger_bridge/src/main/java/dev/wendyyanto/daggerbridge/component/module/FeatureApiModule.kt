package dev.wendyyanto.daggerbridge.component.module

import dagger.Module
import dev.wendyyanto.daggerbridge.component.module.featureone.FeatureOneApiModule

@Module(includes = [FeatureOneApiModule::class])
class FeatureApiModule