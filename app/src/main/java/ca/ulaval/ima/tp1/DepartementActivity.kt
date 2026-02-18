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

        // Création des composants de l'activité
        val departementWebView = findViewById<WebView>(R.id.departementWebView)
        val departementBtnGif = findViewById<Button>(R.id.departementBtnGif)

        // Configuration du WebView
        departementWebView.settings.javaScriptEnabled = true
        departementWebView.webViewClient = WebViewClient() // Force l'ouverture dans l'app, pas le navigateur

        // Récupéreration de l'URL envoyé par MainActivity
        val url = intent.getStringExtra("URL")
        if (url != null) {
            // Affichage de la page Web
            departementWebView.loadUrl(url)
        }

        // Configuration du bouton GIF-3101 pour changer l'url affiché en cas de clic
        departementBtnGif.setOnClickListener {
            departementWebView.loadUrl("https://www.ulaval.ca/etudes/cours/gif-3101-informatique-mobile-et-applications")
        }
    }
}