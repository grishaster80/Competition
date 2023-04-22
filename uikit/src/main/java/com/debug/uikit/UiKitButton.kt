package com.debug.uikit

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class UiKitButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val buttonTextView: TextView by lazy { findViewById(R.id.button_text_view) }

    var buttonText: String = ""
        set(value) {
            buttonTextView.text = value
            field = value
        }

    init {
        inflate(context,R.layout.ui_kit_button,this)
        val attributes = context.theme.obtainStyledAttributes(attrs, R.styleable.UiKitButtonAttributes, 0, 0)
        val buttonText = attributes.getString(R.styleable.UiKitButtonAttributes_button_text)
        buttonTextView.text = buttonText
    }
}

