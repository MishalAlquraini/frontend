package com.meshal.frontend.composses
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp



@Composable
fun QuestionButtons(
    onAnsweredClicked: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(
            onClick = {onAnsweredClicked(true)},
            modifier = Modifier.weight(1f)
        ) {
            Text("Yes")
        }

        Button(
            onClick = {onAnsweredClicked(false)},
            modifier = Modifier.weight(1f)
        ) {
            Text("No")
        }
    }
}
