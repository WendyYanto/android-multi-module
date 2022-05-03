package dev.wendyyanto.featuretwo.utility

import dev.wendyyanto.base.utility.AppUtility
import javax.inject.Inject

class FeatureTwoUtility @Inject constructor(
  private val appUtility: AppUtility
) {

  fun getValue(): String {
    return "FeatureTwoUtility + ${appUtility.getValue()}"
  }
}