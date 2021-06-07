package dev.yekta.mycomposeplayground

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import dev.yekta.mycomposeplayground.ui.theme.MyComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposePlaygroundTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        MainMenuButton(
                            "Try1: Hello Compose!",
                            onClick = { startActivity(Intent(this@MainActivity, Try1::class.java)) }
                        )
                        MainMenuButton(
                            "Try2: Let's Compose!",
                            onClick = { startActivity(Intent(this@MainActivity, Try2::class.java)) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun MainMenuButton(title: String, onClick: () -> Unit) {
    Button(modifier = Modifier.padding(12.dp), onClick = onClick) {
        Text(text = title)
    }
}