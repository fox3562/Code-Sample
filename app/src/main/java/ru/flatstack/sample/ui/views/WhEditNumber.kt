package ru.flatstack.sample.ui.views

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.item_number.view.*
import ru.flatstack.sample.R

class WhEditNumber(
    context: Context, attributeSet: AttributeSet
) : ConstraintLayout(
    context, attributeSet
) {

    lateinit var inflater: LayoutInflater

    init {
        initView(context, attributeSet)
    }

    private fun initView(context: Context, attributeSet: AttributeSet) {
        val a: TypedArray =
            context.obtainStyledAttributes(attributeSet, R.styleable.WhEditNumberOptions, 0, 0)

        val titleText = a.getString(R.styleable.WhEditNumberOptions_textTitleEditNumber)

        a.recycle()

        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        this.addView(inflater.inflate(R.layout.item_number, null))
        this.isClickable = true

        itemNumberText.setText(titleText)
    }
}