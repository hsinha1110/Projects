package com.example.loginsignup

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import org.w3c.dom.Text

@Composable
fun LoginScreen() {
    val darkBlue = Color(0xFF0B2545)
    val lightBlue = Color(0xFF3F72AF)
    var emailAddress by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        // Top Image
        Image(
            painter = painterResource(R.drawable.students),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )

        // Skip
        Text(
            text = "Skip",
            color = Color.White,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(
                    horizontal = 20.dp,
                    vertical = 50.dp
                ),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        // Login Content
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            // Profile Circle
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
                    .background(darkBlue)
                    .border(
                        width = 2.dp,
                        color = Color.White,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center,

                ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = Color.White,
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(125f)
                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Welcome Back",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(90.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Email Address",
                    color = Color.Gray
                )

                TextField(
                    value = emailAddress,
                    onValueChange = {
                        emailAddress = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = lightBlue,
                        unfocusedIndicatorColor = lightBlue,
                        cursorColor = lightBlue,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    )
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Password",
                    color = Color.Gray
                )
                TextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = lightBlue,
                        unfocusedIndicatorColor = lightBlue,
                        cursorColor = lightBlue,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    )

                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Forgot Password?",
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    color = lightBlue, textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(onClick = {})
                )
                Spacer(modifier = Modifier.height(60.dp))
                Button(
                    onClick = {}, colors = ButtonDefaults.buttonColors(
                        containerColor = lightBlue,
                        contentColor = Color.White,
                    ), modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                ) {
                    Text("LOGIN", style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold))
                }
                 Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        "Don't have an account?",
                        style = TextStyle(fontSize = 18.sp, color = Color.Gray)
                    )
                    Text(
                        "SIGN UP",
                        modifier = Modifier.clickable(onClick = {}),
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = lightBlue
                        )
                    )

                }
            }
        }

    }

}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}