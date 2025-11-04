package android.belajar.as04.ui


import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class FormViewModel : ViewModel() {
    var firstName = mutableStateOf("")
    var lastName = mutableStateOf("")
    var email = mutableStateOf("")
    var errorMessage = mutableStateOf("")
    var result = mutableStateOf("")

    fun onSubmit() {
        // Validasi sederhana
        if (firstName.value.isBlank() || lastName.value.isBlank() || email.value.isBlank()) {
            errorMessage.value = "Semua field harus diisi."
            result.value = ""
        } else if (!email.value.contains("@")) {
            errorMessage.value = "Email tidak valid, harus mengandung '@'."
            result.value = ""
        } else {
            // Gabungkan dua input (contoh: firstName + lastName)
            val fullName = "${firstName.value} ${lastName.value}"
            result.value = "Halo, $fullName!\nEmail: ${email.value}"
            errorMessage.value = ""
        }
    }
}
