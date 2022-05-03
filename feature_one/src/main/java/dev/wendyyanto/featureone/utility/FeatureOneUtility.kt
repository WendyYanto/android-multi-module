package dev.wendyyanto.featureone.utility

import javax.inject.Inject

class FeatureOneUtility @Inject constructor() {

  fun getValue(): String {
    return "FeatureOneUtility"
  }
}