package com.example.mohamed.wasla

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.os.Build
import android.view.View
import android.graphics.Typeface
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupContentWindow()
        setContentView(R.layout.activity_main)
        val bold_wasla = Typeface.createFromAsset(assets, "fonts/bold-wasla.ttf")
        val medium_wasla = Typeface.createFromAsset(assets, "fonts/medium-wasla.ttf")

        logo.setTypeface(bold_wasla)
        logo_lite.setTypeface(medium_wasla)

        searchView.setQueryHint("Search or enter address");

    }

    fun setupContentWindow() {
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = Color.TRANSPARENT
        }
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
    }
}
