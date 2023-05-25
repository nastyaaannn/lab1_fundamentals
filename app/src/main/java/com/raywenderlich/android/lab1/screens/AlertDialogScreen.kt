package com.raywenderlich.android.lab1.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

@Composable
fun AlertDialogScreen() {

    MyAlertDialog()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyAlertDialog() {
    Column(modifier = Modifier.fillMaxWidth(1f)) {
        Text(
            modifier = Modifier.fillMaxWidth(1f),
            text = "Тест текста после нажатия кнопки", fontSize = 28.sp,
            fontStyle = FontStyle.Normal
            , fontWeight = FontWeight.W700
            , fontFamily = FontFamily.Monospace
            , textAlign = TextAlign.End
        )
    }
}