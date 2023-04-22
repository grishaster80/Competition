package com.debug.uikit

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class UiKitCardScrollableItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val titleTextView: TextView by lazy { findViewById(R.id.title_text) }
    private val descriptionTextView: TextView by lazy { findViewById(R.id.description_text) }
    private val iconImage: ImageView by lazy { findViewById(R.id.icon_image) }

    init {
        inflate(context, R.layout.ui_kit_card_scrollable_vertical_item, this)
        val attributes =
            context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.UiKitCardScrollableVerticalItem,
                0,
                0
            )
        val titleText =
            attributes.getString(R.styleable.UiKitCardScrollableVerticalItem_card_scrollable_title)
        val descriptionText =
            attributes.getString(R.styleable.UiKitCardScrollableVerticalItem_card_scrollable_description)
        val icon =
            attributes.getDrawable(R.styleable.UiKitCardScrollableVerticalItem_card_scrollable_icon)

        titleTextView.text = titleText
        descriptionTextView.text = descriptionText
        iconImage.setImageDrawable(icon)


    }
}