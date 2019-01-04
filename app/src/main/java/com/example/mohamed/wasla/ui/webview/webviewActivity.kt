package com.example.mohamed.wasla.ui.webview

import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.WindowManager
import com.example.mohamed.wasla.R
import kotlinx.android.synthetic.main.activity_webview.*
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast


class webviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupContentWindow()
        setContentView(R.layout.activity_webview)
        val medium_wasla = Typeface.createFromAsset(assets, "fonts/medium-wasla.ttf")
        var url: String = intent.getStringExtra("url")
        val webView = findViewById<View>(R.id.webview) as WebView
        webView.getSettings().setJavaScriptEnabled(true)
        webView.getSettings().setDomStorageEnabled(true)
        webView!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                toolbar_title.setText(url)
                toolbar_title.setTypeface(medium_wasla)
                return true
            }
        }
        webView.loadUrl(url)
        toolbar_title.setText(url)
        toolbar_title.setTypeface(medium_wasla)

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
