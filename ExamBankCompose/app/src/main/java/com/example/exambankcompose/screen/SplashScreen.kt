package com.example.exambankcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.exambankcompose.R
import com.example.exambankcompose.Routes

@Composable
fun SplashScreen(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colors.primary)
    ) {
        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.logo))
        val logoAnimationState = animateLottieCompositionAsState(composition = composition)

        LottieAnimation(
            composition = composition,
            progress = { logoAnimationState.progress }
        )
        if (logoAnimationState.isAtEnd && logoAnimationState.isPlaying) {
            // from splash screen, we go to log in screen
            navController.navigate(Routes.Login.route)
        }
    }
}