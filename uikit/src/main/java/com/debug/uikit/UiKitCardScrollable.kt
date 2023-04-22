package com.debug.uikit

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class UiKitCardScrollable @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val titleTextView: TextView by lazy { findViewById(R.id.header_text) }
    private val buttonBold: TextView by lazy { findViewById(R.id.button_bold_text) }
    private val buttonMain: UiKitButton by lazy { findViewById(R.id.button_main) }

    init {
        inflate(context, R.layout.ui_kit_card_scrollable, this)
        val attributes =
            context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.UiKitCardScrollableMain,
                0,
                0
            )
        val titleText =
            attributes.getString(R.styleable.UiKitCardScrollableMain_card_scrollable_main_title)
        val buttonBoldText =
            attributes.getString(R.styleable.UiKitCardScrollableMain_card_scrollable_main_button_bold_text)
        val buttonMainText =
            attributes.getString(R.styleable.UiKitCardScrollableMain_card_scrollable_main_button_main_text)

        titleTextView.text = titleText
        buttonBold.text = buttonBoldText
        if (buttonMainText != null) {
            buttonMain.buttonText = buttonMainText
        }


    }
}