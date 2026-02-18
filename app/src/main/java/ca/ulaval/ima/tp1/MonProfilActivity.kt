package ca.ulaval.ima.tp1

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
class MonProfilActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monprofil)

        // Récupéreration de l'objet Profil envoyé par MainActivity
        // Cas 1: Version d'API récent >= 33.0
        val profil = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("Profil", Profil::class.java)
        }
        // Cas 2: Version d'API ancienne < 33.0
        else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra("Profil")
        }

        if (profil != null) {
            // Récupération des composants de l'activité (fichier .XML)
            val txtPrenom = findViewById<TextView>(R.id.monProfilPrenomValue)
            val txtNom = findViewById<TextView>(R.id.monProfilNomValue)
            val txtIdul = findViewById<TextView>(R.id.monProfilIdulValue)
            val txtDate = findViewById<TextView>(R.id.monProfilDateNaissanceValue)

            // Attribution des valeurs aux composants de l'activité à partir du Profil
            txtPrenom.text = profil.prenom
            txtNom.text = profil.nom
            txtIdul.text = profil.idul
            txtDate.text = profil.dateNaissance.toString()
        }
    }
}
