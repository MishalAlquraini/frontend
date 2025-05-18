package com.meshal.frontend.composses

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