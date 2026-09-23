package com.bruce.week2assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Music() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background_pink),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "⌄",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Liked Songs",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "•••",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(16.dp))


            Image(
                painter = painterResource(id = R.drawable.music_pic),
                contentDescription = "BTS Album Cover",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(20.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Hooligan",
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "BTS",
                        fontSize = 18.sp,
                        color = Color.Black.copy(alpha = 0.7f),
                        fontWeight = FontWeight.Medium
                    )
                }
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Like",
                    tint = Color.Black,
                    modifier = Modifier.size(40.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .background(Color.Black, shape = RoundedCornerShape(3.dp))
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "0:12", fontSize = 12.sp, color = Color.Black.copy(alpha = 0.7f))
                Text(text = "-2:14", fontSize = 12.sp, color = Color.Black.copy(alpha = 0.7f))
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "⏮", fontSize = 32.sp)
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .background(Color.Black, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.Pause,
                        contentDescription = "Pause",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                }
                Text(text = "⏭", fontSize = 32.sp)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(
                        color = Color(0xFF3D1308),
                        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                    )
                    .padding(20.dp)
            ) {
                Column (
                    modifier = Modifier.verticalScroll(rememberScrollState())
                ){
                    Text(
                        text = "Lyrics",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Watch this, watch this beat goin' hooligan\n" +
                                "We pop out, we actin' a fool again (ooh)\n" +
                                "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                                "Watch this, watch this beat goin' hooligan (ooh)\n" +
                                "Why this bassline slappin' so rude?\n" +
                                "Drop it lower than chopped and screwed (screwed, screwed, screwed)\n" +
                                "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                                "Watch this, watch this beat goin' hooligan\n" +
                                "Man, I'm 'bout to blow a fuse (yeah)\n" +
                                "통제 불능 머리 춤 (yeah)\n" +
                                "뛰어 미친놈인 듯 (uh)\n" +
                                "Me everywhere, 얼쑤\n" +
                                "Somebody move, somebody move\n" +
                                "다들 모여 하나 둘 (uh)\n" +
                                "I can never ever choose (yeah)\n" +
                                "Every one o' you a muse\n" +
                                "Crowd lookin' like a campus\n" +
                                "Beat drop, 우린 dancin'\n" +
                                "Watch this, watch this beat goin' hooligan\n" +
                                "We pop out, we actin' a fool again\n" +
                                "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                                "Watch this, watch this beat goin' hooligan\n" +
                                "Why this bassline slappin' so rude?\n" +
                                "Drop it lower than chopped and screwed (screwed, screwed, screwed)\n" +
                                "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                                "Watch this, watch this beat goin' hooligan\n" +
                                "I go cuckoo, crazy, loco, save me\n" +
                                "Like El Cucuy, 굳이 말 안 해도 알잖아\n" +
                                "Hooligan, like hooligan, 때려 부숴 like hooligan\n" +
                                "시간 됐으니 좀 비켜 좀, all clear, 이상 무\n" +
                                "Take you out, take you out\n" +
                                "What's the future? Where's the now?\n" +
                                "This is international\n" +
                                "Make it unforgettable\n" +
                                "Watch this, watch this beat goin' hooligan\n" +
                                "We pop out, we actin' a fool again (ooh)\n" +
                                "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                                "Watch this, watch this beat goin' hooligan (ooh)\n" +
                                "Yeah, we the mess, gonna get a bigger mop here (bigger mop)\n" +
                                "This that K, gotta get a better pop here (better pop)\n" +
                                "You gon' hear this one playin' round the clock, yeah (round the clock)\n" +
                                "Round the clock, clock, clock, clock\n" +
                                "Why this bassline slappin' so rude?\n" +
                                "Drop it lower than chopped and screwed (screwed, screwed, screwed)\n" +
                                "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                                "Watch this, watch this beat goin' hooligan\n" +
                                "Why this bassline slappin' so rude?\n" +
                                "Drop it lower than chopped and screwed (screwed, screwed, screwed)\n" +
                                "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                                "Watch this, watch this beat goin' hooligan",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MusicPreview() {
    Music()
}