package com.raywenderlich.android.lab1.screens

import android.annotation.SuppressLint

import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material.*

import androidx.compose.runtime.Composable

import androidx.compose.runtime.rememberCoroutineScope

import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.sp

import com.raywenderlich.android.lab1.router.BackButtonHandler

import com.raywenderlich.android.lab1.router.FundamentalsRouter

import com.raywenderlich.android.lab1.router.Screen

import kotlinx.coroutines.launch




@Composable

fun ExploreButtonsScreen() {

    Column(

        modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Top

    ) {




        MyButton()

        MyRadioGroup()

        MyFloatingActionButton()

        LessDrawer()




        BackButtonHandler {

            FundamentalsRouter.navigateTo(Screen.Navigation)

        }

    }

}




@Composable

fun MyFloatingActionButton() {

}




@Composable

fun MyRadioGroup() {

}




@Composable

fun MyButton() {




}




@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Composable

fun LessDrawer() {

    val scaffoldState = rememberScaffoldState()

    val scope = rememberCoroutineScope()




    Scaffold(

        scaffoldState = scaffoldState,

        drawerContent = {

            Text("Пункт меню 1", fontSize = 28.sp)

            Text("Пункт меню 2", fontSize = 28.sp)

            Text("Пункт меню 3", fontSize = 28.sp)

        }

    ) {

        Button(onClick = {

            scope.launch {

                scaffoldState.drawerState.open()

            }

        }) {

            Text("Меню", fontSize = 28.sp)

        }

    }

}