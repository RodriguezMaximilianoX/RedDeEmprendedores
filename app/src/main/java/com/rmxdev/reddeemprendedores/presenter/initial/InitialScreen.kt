package com.rmxdev.reddeemprendedores.presenter.initial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rmxdev.reddeemprendedores.R
import com.rmxdev.reddeemprendedores.ui.theme.DarkBlue

@Composable
fun InitialScreen(
    modifier: Modifier = Modifier,
    navigateToLogin: () -> Unit = {},
    navigateToRegister: () -> Unit = {}
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.principal_bk),
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
                    .padding(padding),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    "Red\nde\nEmprendedores",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    lineHeight = 40.sp
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    "Cada barrio tiene algo bueno para ofrecer",
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.weight(2f))
                Button(
                    onClick = { navigateToLogin() },
                    colors = ButtonDefaults.buttonColors(DarkBlue),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text("Iniciar sesión", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                }
                Button(
                    onClick = { navigateToRegister() },
                    colors = ButtonDefaults.buttonColors(DarkBlue),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text("Crear una cuenta", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}
