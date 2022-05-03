package dev.wendyyanto.androidmultimodule.di

import dev.wendyyanto.androidmultimodule.di.module.AppComponent

interface ComponentProvider {

  fun loadAppComponent(): AppComponent
}