package dev.yekta.mycomposeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.yekta.mycomposeplayground.ui.theme.*

class Try1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Try1Frame()
        }
    }
}

@Composable
fun Try1Frame() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.background(blueGrey500()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hello Compose!",
                modifier = Modifier
                    .borderColor(purple500())
                    .borderColor(indigo500())
                    .borderColor(blue500())
                    .borderColor(green500())
                    .borderColor(yellow500())
                    .borderColor(orange500())
                    .borderColor(red500())
                    .borderColor(white()),
                style = TextStyle(color = black())
            )
        }
    }
}

fun Modifier.borderColor(color: Color): Modifier =
    background(color, RoundedCornerShape(100)).padding(12.dp)

@Preview(showBackground = true)
@Composable
fun Try1Preview() {
    MyComposePlaygroundTheme {
        Try1Frame()
    }
}