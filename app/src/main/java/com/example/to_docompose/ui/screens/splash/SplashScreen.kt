//package com.example.to_docompose.ui.screens.splash
//
//import androidx.compose.animation.core.animateDpAsState
//import androidx.compose.animation.core.animateFloatAsState
//import androidx.compose.animation.core.tween
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.isSystemInDarkTheme
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.offset
//import androidx.compose.foundation.layout.size
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.alpha
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.to_docompose.R
//import com.example.to_docompose.ui.theme.LOGO_HEIGHT
//import com.example.to_docompose.ui.theme.ToDoComposeTheme
//import com.example.to_docompose.util.Constants
//import kotlinx.coroutines.delay
//
//@Composable
//fun SplashScreen(
//    navigateToListScreen: () -> Unit
//) {
//
//    var startAnimation by remember {
//        mutableStateOf(false)
//    }
//    val offsetState by animateDpAsState(
//        targetValue = if(startAnimation) 0.dp else 100.dp,
//        animationSpec = tween(
//            durationMillis = 1000
//        )
//    )
//    val alphaState by animateFloatAsState(
//        targetValue = if(startAnimation) 1f else 0f,
//        animationSpec = tween(
//            durationMillis = 1000
//        )
//    )
//
//    LaunchedEffect(key1 = true) {
//        startAnimation = true
//        delay(Constants.SPLASH_SCREEN_DELAY)
//        navigateToListScreen()
//    }
//
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                color = MaterialTheme.colorScheme.onSecondary
//            ),
//        contentAlignment = Alignment.Center
//    ) {
//        Image(
//            modifier = Modifier.size(LOGO_HEIGHT)
//                .offset(y = offsetState)
//                .alpha(alpha = alphaState),
//            painter = painterResource(
//                id = getLogo()
//            ),
//            contentDescription = stringResource(R.string.to_do_logo)
//        )
//    }
//}
//
//@Composable
//fun getLogo(): Int {
//    return if(isSystemInDarkTheme()){
//        R.drawable.logo_dark
//    } else {
//        R.drawable.logo_light
//    }
//}
//
//@Composable
//@Preview
//fun SplashScreenPreview() {
//    SplashScreen(
//        navigateToListScreen = {}
//    )
//}
//
//@Composable
//@Preview
//fun SplashScreenPreview2() {
//    ToDoComposeTheme(darkTheme = true) {
//        SplashScreen(
//            navigateToListScreen = {}
//        )
//    }
//}