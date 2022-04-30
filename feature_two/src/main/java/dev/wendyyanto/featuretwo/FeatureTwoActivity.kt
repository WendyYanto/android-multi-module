package dev.wendyyanto.featuretwo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.wendyyanto.featuretwo.databinding.ActivityFeatureTwoBinding

class FeatureTwoActivity : AppCompatActivity() {

  private val viewBinding: ActivityFeatureTwoBinding by lazy(LazyThreadSafetyMode.NONE) {
    ActivityFeatureTwoBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(viewBinding.root)
  }
}