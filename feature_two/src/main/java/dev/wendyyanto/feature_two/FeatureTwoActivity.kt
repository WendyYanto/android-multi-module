package dev.wendyyanto.feature_two

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.wendyyanto.feature_two.databinding.ActivityFeatureTwoBinding

class FeatureTwoActivity : AppCompatActivity() {

  private val viewBinding: ActivityFeatureTwoBinding by lazy(LazyThreadSafetyMode.NONE) {
    ActivityFeatureTwoBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(viewBinding.root)
  }
}