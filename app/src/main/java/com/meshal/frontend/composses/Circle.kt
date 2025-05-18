package com.meshal.frontend.composses

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.meshal.frontend.R

@Composable
fun ResultCircle(isCorrect:Boolean, modifier: Modifier = Modifier){
    val color = if (isCorrect) Color.Green else Color.Red
    val texts = if (isCorrect) stringResource(R.string.correct answer)
    else
        stringResource (R.string.false )
}