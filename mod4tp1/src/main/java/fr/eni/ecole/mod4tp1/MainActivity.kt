package fr.eni.ecole.mod4tp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.eni.ecole.mod4tp1.ui.theme.CoursAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Dice()

                    }
                }
            }
        }
    }
}

@Composable
fun Dice(viewModel: DiceViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {

    val totalLaunch by viewModel.totalLaunch.collectAsState()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = viewModel.diceImageId),
            contentDescription = "Dé",
            modifier = Modifier.size(75.dp)
        )
        Text(totalLaunch.toString())
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Total  = ${viewModel.totalLeft} / ${viewModel.nbThrowLeft}")
                Button(
                    onClick = {
                        viewModel.rollLeft()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("GAUCHE")
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Total  = ${viewModel.totalRight} / ${viewModel.nbThrowRight}",
                    textAlign = TextAlign.Right,
                    modifier = Modifier.fillMaxWidth()
                )
                Button(
                    onClick = {
                        viewModel.rollRight()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("DROITE")
                }
            }
        }
        Button(onClick = {
            viewModel.reset()
        }) {
            Text("Recommencer")
        }
    }


}


@Preview(showBackground = true)
@Composable
fun Preview() {
    Dice()
}