package com.meshal.frontend.composses

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.meshal.frontend.R

//@Composable
//fun ResultCircle(isCorrect:Boolean, modifier: Modifier = Modifier){
//    val color = if (isCorrect) Color.Green else Color.Red
//    val texts = if (isCorrect) stringResource(R.string.correct answer)
//    else
//        stringResource (R.string.false )
//}

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun AnswerIndicator(answerState: Boolean?) {
    answerState?.let { isCorrect ->
        val color = if (isCorrect) Color.Green else Color.Red
        Box(
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
                .background(color = color)
        )
    }
}
