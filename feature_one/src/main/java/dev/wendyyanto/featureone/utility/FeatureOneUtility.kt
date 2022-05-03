package dev.wendyyanto.featureone.utility

import dev.wendyyanto.base.utility.AppUtility
import javax.inject.Inject

class FeatureOneUtility @Inject constructor(
  private val appUtility: AppUtility
) {

  fun getValue(): String {
    return "FeatureOneUtility + ${appUtility.getValue()}"
  }
}