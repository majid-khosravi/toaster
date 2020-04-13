package utils

import android.content.Context
import android.widget.Toast


class ToasterMessage {

    companion object{
        fun showToast(ctx: Context, message: String?) {
            Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show()
        }

    }
}