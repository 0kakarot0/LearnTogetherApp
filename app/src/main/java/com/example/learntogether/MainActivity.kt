package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    LearnTogetherImage(
                        titleText = stringResource(R.string.jetpack_compose_tutorial_title),
                        descriptionText = stringResource(R.string.jetpack_compose_tutorial_description),
                        tutorialInstruction = stringResource(R.string.jetpack_compose_tutorial_intructions),
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    titleText: String,
    descriptionText: String,
    tutorialInstruction: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = titleText,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = descriptionText,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = tutorialInstruction,
            fontSize = 14.sp,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        LearnTogetherImage(
            titleText = stringResource(R.string.jetpack_compose_tutorial_title),
            descriptionText = stringResource(R.string.jetpack_compose_tutorial_description),
            tutorialInstruction = stringResource(R.string.jetpack_compose_tutorial_intructions),
            modifier = Modifier
                .padding(1.dp)
                .fillMaxSize()
        )
    }
}


@Composable
fun LearnTogetherImage(
    titleText: String,
    descriptionText: String,
    tutorialInstruction: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Greeting(
            titleText = stringResource(R.string.jetpack_compose_tutorial_title),
            descriptionText = stringResource(R.string.jetpack_compose_tutorial_description),
            tutorialInstruction = stringResource(R.string.jetpack_compose_tutorial_intructions),
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()
        )
    }
}