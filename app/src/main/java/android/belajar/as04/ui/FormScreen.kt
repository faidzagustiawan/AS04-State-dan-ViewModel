package android.belajar.as04.ui


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormScreen(viewModel: FormViewModel) {
    val firstName by viewModel.firstName
    val lastName by viewModel.lastName
    val email by viewModel.email
    val errorMessage by viewModel.errorMessage
    val result by viewModel.result

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = firstName,
            onValueChange = { viewModel.firstName.value = it },
            label = { Text("Nama Depan") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = lastName,
            onValueChange = { viewModel.lastName.value = it },
            label = { Text("Nama Belakang") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = email,
            onValueChange = { viewModel.email.value = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        if (errorMessage.isNotEmpty()) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = errorMessage, color = MaterialTheme.colorScheme.error)
        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.onSubmit() }) {
            Text("Kirim")
        }

        if (result.isNotEmpty()) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = result)
        }
    }
}
