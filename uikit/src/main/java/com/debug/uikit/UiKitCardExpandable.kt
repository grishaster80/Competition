package com.debug.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class UiKitCardExpandable @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val headerTextView: TextView by lazy { findViewById(R.id.header_text) }
    private val subheaderTextView: TextView by lazy { findViewById(R.id.subheader_text) }
    private val iconImage: ImageView by lazy { findViewById(R.id.icon_image) }
    private val buttonLayout: UiKitButton by lazy { findViewById(R.id.card_button_layout) }

    init {
        inflate(context, R.layout.ui_kit_card_expandable, this)
        val attributes =
            context.theme.obtainStyledAttributes(attrs, R.styleable.UiKitCardExpandable, 0, 0)
        val headerText =
            attributes.getString(R.styleable.UiKitCardExpandable_card_expandable_header_text)
        val subheaderText =
            attributes.getString(R.styleable.UiKitCardExpandable_card_expandable_subheader_text)
        val buttonText =
            attributes.getString(R.styleable.UiKitCardExpandable_card_expandable_button_text)
        val icon = attributes.getDrawable(R.styleable.UiKitCardExpandable_card_expandable_icon)


        headerTextView.text = headerText
        subheaderTextView.text = subheaderText
        if (buttonText != null) {
            buttonLayout.buttonText = buttonText
        }

        if (subheaderText.isNullOrEmpty()) {
            subheaderTextView.visibility = View.GONE
            val layoutParams = headerTextView.layoutParams as? LayoutParams
            layoutParams?.clearConstraints()
            layoutParams?.topToTop = R.id.icon_image
            layoutParams?.bottomToBottom = R.id.icon_image
            layoutParams?.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
        }

        if (buttonText.isNullOrEmpty()) {
            buttonLayout.visibility = View.GONE
        }

        if (icon != null) {
            iconImage.setImageDrawable(icon)
        }

    }
}