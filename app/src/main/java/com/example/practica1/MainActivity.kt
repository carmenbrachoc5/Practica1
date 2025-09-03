package com.example.practica1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.practica1.ui.theme.Practica1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        "Carmen Bracho",
                        "221000121",
                    )
                }

            }
        }
    }
}
@Composable
fun GreetingText(message:String,from:String, modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = message,
            fontSize = 110.sp,
            lineHeight = 116.sp,
            color = Color.Red

        )
        Text(
            text = from,
            fontSize = 30.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practica1Theme {
        GreetingText("Carmen Bracho", "221000121")
    }
}
