package dev.wendyyanto.androidmultimodule.utility

import javax.inject.Inject

class AppUtility @Inject constructor() {

  fun getValue(): String {
    return "AppUtility"
  }
}