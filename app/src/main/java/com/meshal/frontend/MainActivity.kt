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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.meshal.frontend.ui.theme.FrontendTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FrontendTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Column (modifier = Modifier
                       .padding(innerPadding)
                       .fillMaxSize(),
                       verticalArrangement = Arrangement.SpaceBetween,
                       horizontalAlignment = Alignment.CenterHorizontally
                   ){
                       Question(
                           content = "how old are you",
                       )

//                       Box(
//                           modifier = Modifier,
//                           contentAlignment = Alignment.CenterHorizontally
//                       )

                       var answer :Boolean
                     Row{
                         Button(onClick = {answer = true}) {
                            Text("Correct")
                         }
                         Spacer(modifier = Modifier.width(26.dp))

                         Button(onClick = {answer = false}){
                             Text("False")
                         }
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
        text =  "$content?",
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