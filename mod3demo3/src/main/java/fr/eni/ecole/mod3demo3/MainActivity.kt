package fr.eni.ecole.mod3demo3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import fr.eni.ecole.mod3demo3.ui.theme.CoursAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun RowAndColumnExample() {

    Column {
        Text("Exemple de row et column")
        Row {
            Text("Article 1")
            Text("Article 2")
            Text("Article 3")
        }
        Column {
            Text("Article 4")
            Text("Article 5")
            Text("Article 6")
        }
    }
}

@Composable
fun BoxExample() {

    Box(contentAlignment = Alignment.BottomEnd) {
        Image(
            painter = painterResource(id = R.drawable.compose_man),
            contentDescription = "Compose man",
            modifier = Modifier.clip(CircleShape)
        )
        Icon(
            imageVector = Icons.Default.Face,
            contentDescription = null,
            tint = Color.Red
        )
    }

}

@Preview
@Composable
fun Preview() {
    BoxExample()
}











