package dev.wendyyanto.feature_one

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.wendyyanto.feature_one.databinding.ActivityFeatureOneBinding

class FeatureOneActivity : AppCompatActivity() {

  private val viewBinding: ActivityFeatureOneBinding by lazy(LazyThreadSafetyMode.NONE) {
    ActivityFeatureOneBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(viewBinding.root)
  }
}