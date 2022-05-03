package dev.wendyyanto.featuretwo.utility

import dev.wendyyanto.base.utility.AppUtility
import dev.wendyyanto.feature_one_api.FeatureOneUtility
import javax.inject.Inject

class FeatureTwoUtility @Inject constructor(
  private val appUtility: AppUtility,
  private val featureOneUtility: FeatureOneUtility
) {

  fun getValue(): String {
    return "FeatureTwoUtility + ${appUtility.getValue()}"
  }

  fun getMergedValue(): String {
    return "${getValue()} + ${featureOneUtility.getValue()}"
  }
}