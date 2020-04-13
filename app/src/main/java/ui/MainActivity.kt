package ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ir.khosravi.toaster.R
import utils.ToasterMessage

class MainActivity : AppCompatActivity() {
    private var debugMode = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ToasterMessage.showToast(this, "")

   /*     R.id.basic_titled_buttons.onClickDebounced {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices, textColorRes = R.color.colorPrimaryDark, textSizeRes = R.dimen.header_main_text_size_year)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(R.string.agree, textColorRes = R.color.colorAccent)
                negativeButton(R.string.disagree, textColorRes = R.color.colorPrimary)
                debugMode(debugMode)
                lifecycleOwner(this@MainActivity)
            }
        }*/

    }

    private fun Int.onClickDebounced(click: () -> Unit) {
        findViewById<View>(this).onClickDebounced { click() }
    }

}
