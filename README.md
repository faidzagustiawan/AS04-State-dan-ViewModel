

# 🧩 AS04 – State dan ViewModel

Project ini merupakan latihan penggunaan **State** dan **ViewModel** pada Android menggunakan **Jetpack Compose**.
Aplikasi ini menampilkan form sederhana untuk menginput **Nama Depan**, **Nama Belakang**, dan **Email**, lalu menampilkan hasilnya setelah tombol **Kirim** ditekan.

---

## 📱 Fitur Utama

* Menggunakan **Jetpack Compose** untuk UI deklaratif modern.
* Mengimplementasikan **ViewModel** untuk memisahkan logika bisnis dan UI.
* Validasi input sederhana:

  * Semua field harus diisi.
  * Email harus mengandung tanda `@`.
* Menampilkan hasil penggabungan nama dan email jika input valid.

---

## 🧠 Struktur Kelas

### 🏠 `MainActivity.kt`

* Mengatur entry point aplikasi.
* Membuat instance `FormViewModel` menggunakan `viewModel()`.
* Menampilkan `FormScreen()` dengan ViewModel sebagai parameter.

### 🎨 `FormScreen.kt`

* Menyediakan tampilan form input:

  * Nama Depan
  * Nama Belakang
  * Email
* Menampilkan pesan error dan hasil submit dari ViewModel.

### ⚙️ `FormViewModel.kt`

* Menyimpan state form menggunakan `mutableStateOf`.
* Memproses input dan validasi ketika tombol "Kirim" ditekan.
* Mengelola pesan error dan hasil output.

---




## 👨‍💻 Pembuat

**Faidz Agustiawan**
Belajar Android Jetpack Compose – State & ViewModel

---

Apakah kamu mau saya tambahkan badge (misalnya Android, Kotlin, Compose) dan screenshot section biar README-nya lebih keren untuk GitHub?
