package dev.wendyyanto.router

import android.content.Context
import android.content.Intent

object Router {

  private const val FEATURE_ONE = "dev.wendyyanto.feature_one.FeatureOneActivity"
  private const val FEATURE_TWO = "dev.wendyyanto.feature_two.FeatureTwoActivity"

  fun goToFeatureOne(context: Context) {
    val clazz = Class.forName(FEATURE_ONE)
    val intent = Intent(context, clazz)
    context.startActivity(intent)
  }

  fun goToFeatureTwo(context: Context) {
    val clazz = Class.forName(FEATURE_TWO)
    val intent = Intent(context, clazz)
    context.startActivity(intent)
  }
}