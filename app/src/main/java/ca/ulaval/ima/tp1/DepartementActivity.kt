package ca.ulaval.ima.tp1

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DepartementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_departement)

        val webView = findViewById<WebView>(R.id.webView)
        val departementBtnFermer = findViewById<Button>(R.id.departementBtnFermer)

        // Configuration du WebView
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient() // Force l'ouverture dans l'app, pas le navigateur

        // Récupéreration de l'URL envoyé par MainActivity
        val url = intent.getStringExtra("URL")
        if (url != null) {
            webView.loadUrl(url)
        }

        departementBtnFermer.setOnClickListener {
            finish() // Revient à l'écran précédent
        }
    }
}