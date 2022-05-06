package dev.wendyyanto.featureone

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.wendyyanto.feature_one_api.FeatureOneUtility
import dev.wendyyanto.featureone.databinding.ActivityFeatureOneBinding
import dev.wendyyanto.featureone.utility.di.FeatureOneComponentProvider
import javax.inject.Inject

class FeatureOneActivity : AppCompatActivity() {

  @Inject
  lateinit var featureOneUtility: FeatureOneUtility

  private val viewBinding: ActivityFeatureOneBinding by lazy(LazyThreadSafetyMode.NONE) {
    ActivityFeatureOneBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    (application as FeatureOneComponentProvider)
      .loadFeatureOneComponent()
      .inject(this)

    super.onCreate(savedInstanceState)

    setContentView(viewBinding.root)

    Toast.makeText(this, featureOneUtility.getValue(), Toast.LENGTH_SHORT).show()
  }
}