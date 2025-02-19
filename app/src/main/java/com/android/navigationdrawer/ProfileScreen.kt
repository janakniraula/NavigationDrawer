package com.android.navigationdrawer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun ProfileScreen() {
    val state = rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.welcome)
    )

    val progress by animateLottieCompositionAsState(
        composition = state.value,
        isPlaying = true,
        iterations = 1000,
        speed = 1.0f
    )

    Box(
        modifier = Modifier.wrapContentSize(),
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(
            composition = state.value,
            progress = { progress }
        )
    }
}
