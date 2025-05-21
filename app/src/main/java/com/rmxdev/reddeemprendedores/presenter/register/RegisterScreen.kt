package com.rmxdev.reddeemprendedores.presenter.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rmxdev.reddeemprendedores.R
import com.rmxdev.reddeemprendedores.ui.theme.DarkBlue
import com.rmxdev.reddeemprendedores.ui.theme.OffWhite

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    navigateToHome: () -> Unit = {}
) {

    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var fullName by rememberSaveable { mutableStateOf("") }
    var dni by rememberSaveable { mutableStateOf("") }
    var bornDate by rememberSaveable { mutableStateOf("") }
    var phone by rememberSaveable { mutableStateOf("") }
    var address by rememberSaveable { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.secondary_bk),
            contentDescription = "fondo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Scaffold(
            containerColor = Color.Transparent
        ) { padding ->
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(padding)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    "Red\nde\nEmprendedores",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    lineHeight = 40.sp,
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    "Cada barrio tiene algo bueno para ofrecer",
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.weight(2f))
                TextField(
                    value = fullName,
                    onValueChange = { fullName = it },
                    label = { Text("Ingrese su nombre y apellido") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = OffWhite,
                        unfocusedContainerColor = OffWhite
                    )
                )
                TextField(
                    value = dni,
                    onValueChange = { dni = it },
                    label = { Text("Ingrese su DNI") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = OffWhite,
                        unfocusedContainerColor = OffWhite
                    )
                )
                TextField(
                    value = bornDate,
                    onValueChange = { bornDate = it },
                    label = { Text("Ingrese su fecha de nacimiento") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = OffWhite,
                        unfocusedContainerColor = OffWhite
                    )
                )
                TextField(
                    value = address,
                    onValueChange = { address = it },
                    label = { Text("Ingrese su domicilio") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = OffWhite,
                        unfocusedContainerColor = OffWhite
                    )
                )
                TextField(
                    value = phone,
                    onValueChange = { phone = it },
                    label = { Text("Ingrese su teléfono") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = OffWhite,
                        unfocusedContainerColor = OffWhite
                    )
                )
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Ingrese su mail") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = OffWhite,
                        unfocusedContainerColor = OffWhite
                    )
                )
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Ingrese su contraseña") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = OffWhite,
                        unfocusedContainerColor = OffWhite
                    )
                )
                Button(
                    onClick = { navigateToHome() },
                    colors = buttonColors(containerColor = DarkBlue),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 24.dp)
                        .height(50.dp)
                ) {
                    Text(
                        text = "Crear cuenta",
                        fontSize = 25.sp,
                        color = White,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }

}