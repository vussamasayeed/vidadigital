package com.vidadigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VidaDigitalTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    VidaHomeScreen()
                }
            }
        }
    }
}

@Composable
fun VidaHomeScreen() {
    val gradient = Brush.verticalGradient(
        colors = listOf(Color(0xFF0A4C8B), Color(0xFF1FAE9B))
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradient)
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Vida Digital",
            color = Color.White,
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hire trusted people across the EU for short tasks with temporary authorization contracts.",
            color = Color.White,
            style = MaterialTheme.typography.bodyLarge
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Popular services",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("• Wait in line at an office, embassy, or public service")
                Text("• Hire a local translator for calls and in-person help")
                Text("• Send someone to gather information at an office")
                Text("• Recover forgotten items and ship them to your city")
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { /* TODO: Open request flow */ }) {
                    Text("Post a task")
                }
            }
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Example: hotel pickup to Barcelona",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("1. Add task: 'Collect my watch from hotel reception in Poland'")
                Text("2. Select a verified provider and agree price/timing")
                Text("3. Authorize pickup through hotel phone or email confirmation")
                Text("4. Provider collects, ships, and uploads proof of completion")
            }
        }
    }
}
