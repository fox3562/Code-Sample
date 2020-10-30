package ru.flatstack.sample.ui.views

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class IconTextView(context: Context, attrs: AttributeSet?) : AppCompatTextView(context, attrs) {

    init {
        initView()
    }

    private fun initView() {
        val tf = Typeface.createFromAsset(
            context.assets,
            "fa-solid-900.ttf"
        )
        typeface = tf
    }
}