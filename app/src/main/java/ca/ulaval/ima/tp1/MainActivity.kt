package ca.ulaval.ima.tp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ca.ulaval.ima.tp1.ui.theme.Tp1Theme
import android.util.Log
import android.widget.Button
import android.content.Intent


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        // Définition des URL
        val urlToLoad = "https://maps.app.goo.gl/PQ7LVkryK9L892LD8"
        val urlToLoad2 = "https://www.fsg.ulaval.ca/departements/departement-de-genie-electrique-et-de-genie-informatique"

        // Définition des boutons
        val btnUniversite = findViewById<Button>(R.id.mainBtnUniversite)
        val btnDepartement = findViewById<Button>(R.id.mainBtnDepartement)
        val btnProfil = findViewById<Button>(R.id.mainBtnProfil)

        // Navigation entre les activités
        btnUniversite.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
        btnProfil.setOnClickListener {
            val intent = Intent(this, MonProfilActivity::class.java)
            startActivity(intent)
        }
        btnDepartement.setOnClickListener {
            val intent = Intent(this, DepartementActivity::class.java)
            intent.putExtra("URL", urlToLoad2)
            startActivity(intent)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tp1Theme {
        Greeting("Android")
    }
}