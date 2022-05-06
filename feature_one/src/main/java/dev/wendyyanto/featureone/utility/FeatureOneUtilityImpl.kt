package dev.wendyyanto.featureone.utility

import dev.wendyyanto.base.utility.AppUtility
import dev.wendyyanto.feature_one_api.FeatureOneUtility
import javax.inject.Inject

class FeatureOneUtilityImpl @Inject constructor(
  private val appUtility: AppUtility
) : FeatureOneUtility {

  override fun getValue(): String {
    return "FeatureOneUtility + ${appUtility.getValue()}"
  }
}