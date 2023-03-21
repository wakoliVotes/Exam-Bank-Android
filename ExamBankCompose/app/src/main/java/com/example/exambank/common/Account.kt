package com.example.exambank.viewscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.exambank.R

@Composable
fun AccountView(
    navController: NavHostController
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        // TO DO
        /* Image Name + email next line
        * General
        * Ratings and Reviews
        * Customer Support
        * Help and Feedback
        * About
        * More
        * Privacy Policy
        * Terms of Use
        * Logout
        * */
        Column(modifier = Modifier.padding(10.dp)) {
            OwnerInfo()
            Spacer(modifier = Modifier.height(10.dp))
            GeneralInfo()
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Preview
@Composable
private fun OwnerInfo() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, start = 10.dp, end = 10.dp)
    )
    {
        Image(
            modifier = Modifier
                .padding(10.dp)
                .width(100.dp)
                .clip(RoundedCornerShape(8.dp)),
            painter = painterResource(id = R.drawable.owner),
            contentDescription = "owner image"
        )
        Box(
            modifier = Modifier.padding(start = 20.dp, top = 10.dp),

            ) {
            Column(
            ) {
                Text(
                    text = "Lively Danielle",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                )
                Text(
                    text = "danielle@yahoo.com",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 14.sp
                    ),
                    modifier = Modifier.padding(top = 5.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                ClickableText(
                    text = AnnotatedString(
                        "Sign Out",
                    ),
                    onClick = {
                        // TO DO - Sign out
                    },
                    style = TextStyle(
                        color = Color.Red,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
    }
}


@Preview
@Composable
private fun GeneralInfo() {
    Box(
        modifier = Modifier.padding(start = 10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                text = "More",
                style = TextStyle(
                    fontWeight = FontWeight.ExtraLight,
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
            )
            Text(
                text = "About",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
            )
            // Divider line
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
            )
            Text(
                text = "Privacy Policy",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
            )
            // Divider line
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
            )
            Text(
                text = "Terms of Use",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
            )
            // Divider line
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
            )
        }
    }
}