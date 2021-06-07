package dev.yekta.mycomposeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.yekta.mycomposeplayground.ui.component.Try2Card
import dev.yekta.mycomposeplayground.ui.theme.grey900
import dev.yekta.mycomposeplayground.ui.theme.invoke
import dev.yekta.mycomposeplayground.ui.theme.yellowA200

data class CardData(
    val title: String,
    val shortDescription: String,
    val description: String,
    val imageUrl: String
)

class Try2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cards: List<CardData> = listOf(
            CardData(
                title = "Perrie Edwards",
                shortDescription = "English singer",
                description = "Perrie Louise Edwards is an English singer and member of the British girl group Little Mix.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/Perrie_Louise_Edwards.jpg/396px-Perrie_Louise_Edwards.jpg"
            ),
            CardData(
                title = "Jade Thirlwall",
                shortDescription = "English singer",
                description = "Jade Amelia Thirlwall is an English singer, songwriter, and a member of the British girl group Little Mix.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Jade_Amelia_Thirlwall.jpg/718px-Jade_Amelia_Thirlwall.jpg"
            ),
            CardData(
                title = "Leigh-Anne Pinnock",
                shortDescription = "English singer",
                description = "Leigh-Anne Pinnock is an English singer, songwriter, actress and member of the British girl group Little Mix.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Leigh-Anne_Pinnock_from_Little_Mix.jpg/720px-Leigh-Anne_Pinnock_from_Little_Mix.jpg"
            ),
        )

        setContent {
            Column(
                modifier = Modifier
                    .background(grey900())
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 24.dp),
                    text = "Explore\nThe\nBest.",
                    style = TextStyle(
                        color = yellowA200(),
                        fontSize = 80.sp,
                        fontWeight = FontWeight(1000)
                    )
                )
                Surface { Try2CardList(cards) }
            }
        }
    }
}

@Composable
fun Try2CardList(cards: List<CardData>) {
    LazyRow(
        modifier = Modifier.background(grey900()),
        contentPadding = PaddingValues(vertical = 24.dp, horizontal = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for ((title, shortDescription, description, imageUrl) in cards) {
            item {
                Try2Card(title, shortDescription, description, imageUrl)
            }
        }
    }
}
