package dev.wendyyanto.featuretwo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.wendyyanto.featuretwo.databinding.ActivityFeatureTwoBinding
import dev.wendyyanto.featuretwo.utility.FeatureTwoUtility
import dev.wendyyanto.featuretwo.utility.di.FeatureTwoComponentProvider
import javax.inject.Inject

class FeatureTwoActivity : AppCompatActivity() {

  @Inject
  lateinit var featureTwoUtility: FeatureTwoUtility

  private val viewBinding: ActivityFeatureTwoBinding by lazy(LazyThreadSafetyMode.NONE) {
    ActivityFeatureTwoBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    (application as FeatureTwoComponentProvider)
      .loadFeatureTwoComponent()
      .inject(this)

    super.onCreate(savedInstanceState)

    setContentView(viewBinding.root)

    Toast.makeText(this, featureTwoUtility.getMergedValue(), Toast.LENGTH_SHORT).show()
  }
}