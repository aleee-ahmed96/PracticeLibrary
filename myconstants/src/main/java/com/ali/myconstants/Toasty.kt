package com.ali.myconstants

import android.content.Context
import android.widget.Toast

class Toasty {
    companion object {
        fun show(context: Context, text: String) {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
        }
    }
}