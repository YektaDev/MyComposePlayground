package dev.yekta.mycomposeplayground.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.glide.rememberGlidePainter
import dev.yekta.mycomposeplayground.ui.theme.*

@Composable
fun Try2Card(title: String, shortDescription: String, description: String, imageUrl: String) =
    Surface(
        modifier = Modifier
            .width(320.dp)
            .height(185.dp)
            .clip(RoundedCornerShape(12.dp)),
        color = grey800(),
    ) {
        Column(modifier = Modifier.padding(24.dp)) {
            Column {
                Row(
                    modifier = Modifier.padding(bottom = 24.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(end = 12.dp)
                            .size(64.dp)
                            .clip(RoundedCornerShape(100)),
                        painter = rememberGlidePainter(imageUrl),
                        contentDescription = "Profile",
                        contentScale = ContentScale.FillBounds,
                    )
                    Column {
                        Text(
                            modifier = Modifier.alpha(.8f),
                            text = title,
                            style = TextStyle(
                                fontWeight = FontWeight(900),
                                fontSize = 16.sp,
                                color = yellow200()
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            modifier = Modifier.alpha(.6f),
                            text = shortDescription,
                            style = TextStyle(fontSize = 12.sp, color = yellow200())
                        )
                    }
                }
            }
            Text(
                text = description,
                style = TextStyle(fontSize = 12.sp, color = grey500(), lineHeight = 16.sp)
            )
        }
    }
