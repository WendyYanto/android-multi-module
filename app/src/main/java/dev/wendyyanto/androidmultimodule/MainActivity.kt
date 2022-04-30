package dev.wendyyanto.androidmultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.wendyyanto.androidmultimodule.databinding.ActivityMainBinding
import dev.wendyyanto.router.Router

class MainActivity : AppCompatActivity() {

  private val viewBinding: ActivityMainBinding by lazy(LazyThreadSafetyMode.NONE) {
    ActivityMainBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(viewBinding.root)

    viewBinding.textGoToFeatureOne.setOnClickListener {
      Router.goToFeatureOne(this@MainActivity)
    }
  }
}