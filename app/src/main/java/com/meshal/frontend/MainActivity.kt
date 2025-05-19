package com.meshal.frontend

import android.os.Binder
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.meshal.frontend.composses.AnswerIndicator
import com.meshal.frontend.composses.QuestionButtons
import com.meshal.frontend.ui.theme.FrontendTheme

class MainActivity : ComponentActivity() {
    private val questions = listOf(
        "Is the Earth round?" to true,
        "Can fish fly?" to false
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FrontendTheme {
                var currentQuestionIndex by remember { mutableStateOf(0) }
                var answerState by remember { mutableStateOf<Boolean?>(null) }

                val (questionText, correctAnswer) = questions[currentQuestionIndex]
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = questionText,
                            style = MaterialTheme.typography.headlineMedium
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        AnswerIndicator(answerState)

                        Spacer(modifier = Modifier.weight(1f))

                        if (answerState == null){
                            QuestionButtons(
                                onTrueClicked = { answerState = true == correctAnswer },
                                onFalseClicked = { answerState = false == correctAnswer }
                            )
                        } else {
                            Button(onClick = {
                                answerState = null
                                currentQuestionIndex = (currentQuestionIndex + 1) % questions.size
                            }) {
                                Text("Next Question")

                            }
                        }

                    }
                }
            }
        }
    }

    @Composable
    fun Question(content: String, modifier: Modifier = Modifier) {
        Text(
            text = "$content?",
            modifier = modifier,
            fontSize = 25.sp
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun QuestionPreview() {
        FrontendTheme {
            Question("Android")
        }
    }
}