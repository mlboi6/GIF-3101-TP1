package ca.ulaval.ima.tp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.content.Intent
import java.time.LocalDate


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurer le profil
        val profil = Profil(
            "Marie-Laure",
            "Boivin",
            LocalDate.of(2003, 8, 5),
            "536 978 305"
        )

        // Définition des URLs
        val urlToLoad = "https://maps.app.goo.gl/PQ7LVkryK9L892LD8"
        val urlToLoad2 = "https://www.fsg.ulaval.ca/departements/departement-de-genie-electrique-et-de-genie-informatique"

        // Définition des boutons
        val btnUniversite = findViewById<Button>(R.id.mainBtnUniversite)
        val btnDepartement = findViewById<Button>(R.id.mainBtnDepartement)
        val btnProfil = findViewById<Button>(R.id.mainBtnProfil)

        // Navigation entre les activités grâce aux boutons
        btnUniversite.setOnClickListener {
            val intent = Intent(this, UniversiteActivity::class.java)
            intent.putExtra("URL", urlToLoad)
            startActivity(intent)
        }
        btnProfil.setOnClickListener {
            val intent = Intent(this, MonProfilActivity::class.java)
            intent.putExtra("Profil", profil)
            startActivity(intent)
        }
        btnDepartement.setOnClickListener {
            val intent = Intent(this, DepartementActivity::class.java)
            intent.putExtra("URL", urlToLoad2)
            startActivity(intent)
        }

    }
}
