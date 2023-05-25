package com.raywenderlich.android.lab1.screens

import android.view.Surface
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment

@Composable
fun SurfaceScreen(modifier: Modifier = Modifier){

    Box(modifier = modifier.fillMaxSize()) {
        MySurface(modifier = modifier.align(Alignment.Center))
    }
    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MySurface(modifier: Modifier) {

}