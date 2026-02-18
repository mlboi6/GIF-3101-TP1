package ca.ulaval.ima.tp1

import android.os.Parcelable
import java.time.LocalDate

@kotlinx.parcelize.Parcelize
data class Profil(
    var nom: String,
    var prenom: String,
    var dateNaissance: LocalDate,
    var idul: String
) : Parcelable