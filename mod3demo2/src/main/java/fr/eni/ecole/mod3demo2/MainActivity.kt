package fr.eni.ecole.mod3demo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hello(name = "Michel")
        }
    }
}

@Composable
fun Hello(name: String) {

    Scaffold {

        Column (modifier = Modifier.padding(it)) {
            Text(
                text = "Hello $name !",
//        color = MaterialTheme.colorScheme.onPrimary
                color = Color.Yellow
            )
            Text(text = "Hello Micheline")
            Text(text = "Hello Micheline")
            Text(text = "Hello Micheline")
            Text(text = "Hello Micheline")
            Text(text = "Hello Micheline")
            Text(text = "Hello Micheline")
        }
    }
}

@Composable
@Preview
fun Preview() {
    Hello(name = "Bernard")
}





