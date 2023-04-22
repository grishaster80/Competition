package com.debug.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class UiKitCardClosable @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val titleTextView: TextView by lazy { findViewById(R.id.title_text) }
    private val descriptionTextView: TextView by lazy { findViewById(R.id.description_text) }
    private val iconImage: ImageView by lazy { findViewById(R.id.icon_image) }
    private val closeIcon: ImageView by lazy { findViewById(R.id.close_icon) }

    init {
        inflate(context, R.layout.ui_kit_card_closable, this)
        val attributes =
            context.theme.obtainStyledAttributes(attrs, R.styleable.UiKitCardClosable, 0, 0)
        val titleText =
            attributes.getString(R.styleable.UiKitCardClosable_card_closable_title_text)
        val descriptionText =
            attributes.getString(R.styleable.UiKitCardClosable_card_closable_description_text)
        val isClosable =
            attributes.getBoolean(R.styleable.UiKitCardClosable_card_closable_is_closable, true)
        val icon = attributes.getDrawable(R.styleable.UiKitCardClosable_card_closable_icon)

        titleTextView.text = titleText
        descriptionTextView.text = descriptionText
        iconImage.setImageDrawable(icon)
        if (isClosable) {
            closeIcon.visibility = View.GONE
        }
    }
}