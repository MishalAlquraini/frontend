package com.meshal.frontend.composses
//
//var answer :Boolean
//Row{
//    Button(onClick = {answer = true}) {
//        Text("Correct")
//    }
//    Spacer(modifier = Modifier.width(26.dp))
//
//    Button(onClick = {answer = false}){
//        Text("False")
//    }
//}

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun QuestionButtons(
    onTrueClicked: () -> Unit,
    onFalseClicked: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(
            onClick = onTrueClicked,
            modifier = Modifier.weight(1f)
        ) {
            Text("Yes")
        }

        Button(
            onClick = onFalseClicked,
            modifier = Modifier.weight(1f)
        ) {
            Text("No")
        }
    }
}
