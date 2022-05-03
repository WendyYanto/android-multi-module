package dev.wendyyanto.androidmultimodule.utility

import dev.wendyyanto.base.utility.AppUtility
import javax.inject.Inject

class AppUtilityImpl @Inject constructor() : AppUtility {

  override fun getValue(): String {
    return "AppUtility"
  }
}