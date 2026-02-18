package ca.ulaval.ima.tp1

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UniversiteActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universite)

        // Création des composants de l'activité
        val universiteWebView = findViewById<WebView>(R.id.universiteWebView)
        val universiteBtnFermer = findViewById<Button>(R.id.universiteBtnFermer)

        // Configuration du WebView
        universiteWebView.settings.javaScriptEnabled = true
        universiteWebView.webViewClient = WebViewClient() // Force l'ouverture dans l'app, pas le navigateur

        // Récupéreration de l'URL envoyé par MainActivity
        val url = intent.getStringExtra("URL")
        if (url != null) {
            // Affichage de la page Web
            universiteWebView.loadUrl(url)
        }

        // Configuration du bouton Fermer
        universiteBtnFermer.setOnClickListener {
            finish() // Retour à l'écran d'accueil
        }
    }
}