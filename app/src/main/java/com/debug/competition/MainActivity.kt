package com.debug.competition

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.debug.uikit.UiKitCardScrollable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstAdapter =
            CustomAdapter(arrayOf(Item("Title", "Description", R.drawable.star_icon)))
        findViewById<UiKitCardScrollable>(R.id.first_scrollable).findViewById<RecyclerView>(com.debug.uikit.R.id.recycler).adapter =
            firstAdapter


        val secondAdapter =
            CustomAdapter(
                arrayOf(
                    Item("Title", "Description", R.drawable.star_icon),
                    Item("Title", "Description", R.drawable.star_icon),
                    Item("Title", "Description", R.drawable.star_icon),
                    Item("Title", "Description", R.drawable.star_icon),
                    Item("Title", "Description", R.drawable.star_icon)
                )
            )
        findViewById<UiKitCardScrollable>(R.id.second_scrollable).findViewById<RecyclerView>(com.debug.uikit.R.id.recycler).adapter =
            secondAdapter
    }
}