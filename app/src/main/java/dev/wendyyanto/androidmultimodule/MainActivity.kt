package dev.wendyyanto.androidmultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.wendyyanto.androidmultimodule.databinding.ActivityMainBinding
import dev.wendyyanto.androidmultimodule.di.ComponentProvider
import dev.wendyyanto.androidmultimodule.di.module.AppComponent
import dev.wendyyanto.androidmultimodule.utility.AppUtility
import dev.wendyyanto.router.Router
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var appUtility: AppUtility

  private val viewBinding: ActivityMainBinding by lazy(LazyThreadSafetyMode.NONE) {
    ActivityMainBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    (application as ComponentProvider)
      .loadAppComponent()
      .inject(this)

    setContentView(viewBinding.root)

    Toast.makeText(this, appUtility.getValue(), Toast.LENGTH_SHORT).show()

    viewBinding.textGoToFeatureOne.setOnClickListener {
      Router.goToFeatureOne(this@MainActivity)
    }

    viewBinding.textGoToFeatureTwo.setOnClickListener {
      Router.goToFeatureTwo(this@MainActivity)
    }
  }
}