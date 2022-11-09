package com.example.exambankcompose

import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun YearOneUnits () {
    OutlinedTextField(value = "Year I", onValueChange = {""} )
}


@Preview
@Composable
fun PreviewYearOnne () {
    YearTwoUnits()
}