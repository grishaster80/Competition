package com.debug.uikit

import androidx.constraintlayout.widget.ConstraintLayout

fun ConstraintLayout.LayoutParams.clearConstraints(){
    this.apply {
        rightToRight = ConstraintLayout.LayoutParams.UNSET
        bottomToBottom = ConstraintLayout.LayoutParams.UNSET
        topToTop = ConstraintLayout.LayoutParams.UNSET
        leftToLeft = ConstraintLayout.LayoutParams.UNSET
        rightToLeft = ConstraintLayout.LayoutParams.UNSET
        bottomToTop = ConstraintLayout.LayoutParams.UNSET
        topToBottom = ConstraintLayout.LayoutParams.UNSET
        leftToRight = ConstraintLayout.LayoutParams.UNSET
    }
}