package ru.flatstack.sample.ui.views

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.item_wh_button.view.*
import ru.flatstack.sample.R

class WhButton(
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
            context.obtainStyledAttributes(attributeSet, R.styleable.WhButtonOptions, 0, 0)

        val titleText = a.getString(R.styleable.WhButtonOptions_textTitleBtn)
        val iconText = a.getString(R.styleable.WhButtonOptions_textIconBtn)
        val topText = a.getString(R.styleable.WhButtonOptions_textTopBtn)
        val leftText = a.getString(R.styleable.WhButtonOptions_textLeftBtn)
        val rightText = a.getString(R.styleable.WhButtonOptions_textRightBtn)

        a.recycle()

        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        this.addView(inflater.inflate(R.layout.item_wh_button, null))
        this.isClickable = true

        itemWhButtonTitleText.setText(titleText)
        itemWhButtonIconText.setText(iconText)
        itemWhButtonTopText.setText(topText)
        itemWhButtonLeftText.setText(leftText)
        itemWhButtonRightText.setText(rightText)

        itemWhButtonTopText.visibility = if (topText == null) GONE else VISIBLE
        itemWhButtonLeftText.visibility = if (leftText == null) GONE else VISIBLE
        itemWhButtonRightText.visibility = if (rightText == null) GONE else VISIBLE
    }
}