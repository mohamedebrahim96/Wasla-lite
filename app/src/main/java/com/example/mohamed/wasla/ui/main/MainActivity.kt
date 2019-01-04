package com.example.mohamed.wasla.ui.main

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.os.Build
import android.view.View
import android.graphics.Typeface
import android.widget.SearchView
import com.example.mohamed.wasla.R
import com.example.mohamed.wasla.utils.MyAlertDialogFragment
import com.example.mohamed.wasla.ui.webview.webviewActivity
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

        text_query.setTypeface(medium_wasla)

        searchView_layout.setOnClickListener {
            searchView_background.visibility = View.GONE
            text_query.visibility = View.GONE
            searchView.visibility = View.VISIBLE
            searchView.setFocusable(true)
            searchView.setIconified(false)
            searchView.requestFocusFromTouch()

        }



        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(url: String): Boolean {
                val intent = Intent(this@MainActivity,webviewActivity::class.java)

                intent.putExtra("url", "https://www.google.com/search?q="+url)
                startActivity(intent)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                return true
            }

            fun callSearch(query: String) {
            }

        })
        //DialogFragment
        val fm = supportFragmentManager
        val myAlertDialogFragment = MyAlertDialogFragment()
        grid_button.setOnClickListener {
            myAlertDialogFragment.show(fm, "PioneersFragment_tag")
        }
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
