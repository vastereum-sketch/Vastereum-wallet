package com.vastereum.wallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vastereum.wallet.ui.theme.VastereumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VastereumTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    WalletHome()
                }
            }
        }
    }
}

@Composable
fun WalletHome() {
    var balance by remember { mutableStateOf("0.00 VSM") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Vastereum Wallet", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(20.dp))
        Text("Balance: $balance", style = MaterialTheme.typography.bodyLarge)
        Spacer(Modifier.height(20.dp))
        Button(onClick = { /* TODO: connect wallet node */ }) {
            Text("Connect Wallet")
        }
    }
}
