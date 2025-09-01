package com.example.composableexercise1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composableexercise1.ui.theme.ComposableExercise1Theme
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposableExercise1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MovieQuote(
                        quote = "To infinity and beyond!",
                        movieName = "Toy Story",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MovieQuote(quote: String, movieName: String, modifier: Modifier = Modifier) {
    Column(Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(Color.Cyan),
        verticalArrangement = Arrangement.Center) {
        Column(
            modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green).padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text(
                text = "\"$quote\"",
                modifier = modifier.fillMaxWidth().padding(bottom = 15.dp),
                textAlign = TextAlign.Center,
                color = Color.Blue,
                fontSize = 60.sp,
                lineHeight = 65.sp,
                fontStyle = FontStyle.Italic


            )
            Text(
                text = movieName,
                modifier = modifier.fillMaxWidth(),
                textAlign = TextAlign.End
            )
        }
        Image(
            painter = painterResource(id = R.drawable.buzz1),
            contentDescription = "buzz lightyear",
            modifier= Modifier.fillMaxWidth().padding(top = 20.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun MovieQuotePreview() {
    ComposableExercise1Theme {
        MovieQuote("To infinity and beyond!", movieName = "Toy Story")
    }
}