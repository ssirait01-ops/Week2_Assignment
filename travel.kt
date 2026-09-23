package com.bruce.week2assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Travel() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.langit),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .align(Alignment.BottomCenter)
                .background(
                    color = Color(0xFFCBA0DC),
                    shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                )
                .padding(24.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "My Travel",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Aurora",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 8.dp),
                    fontSize = 25.sp
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Tromsø, Norway",
                    color = Color.White,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 8.dp),
                )
                Row(
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 8.dp, top = 8.dp)
                ) {
                    repeat(5) {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "Star",
                            tint = Color(0xFFF6C453)
                        )
                    }
                    Text(
                        modifier = Modifier.padding(start = 4.dp),
                        text = "5.0",
                        fontSize = 25.sp,
                        color = Color(0xFFF6C453),
                    )
                }
                Spacer(modifier = Modifier.size(10.dp))

                QuestionCard("What did you enjoy most about your trip?")
                Spacer(modifier = Modifier.height(12.dp))
                QuestionCard("What was your favorite spot?")
                Spacer(modifier = Modifier.height(12.dp))
                QuestionCard("Anything else you'd like to add?")
            }
        }
    }
}

@Composable
fun QuestionCard(question: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp)
            .background(
                color = Color(0xFFDCE6F7),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = question,
            color = Color(0xFF2E2E4D),
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TravelPreview() {
    Travel()
}