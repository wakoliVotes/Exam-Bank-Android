package com.example.exambank.viewscreens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.exambank.common.GradientButton
import com.example.exambank.navigation.Routes
import com.example.exambank.ui.theme.Purple500
import com.example.exambank.ui.theme.color1
import com.example.exambank.ui.theme.color2
import com.example.exambank.R




@Composable
fun SignUp( navController: NavHostController ){

    // Sign Up with Google
    /*
    val startForResult = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK) {
            val intent = result.data
            if( result.data != null) {
                val task: Task<GoogleSignInAccount> =
                    GoogleSignIn.getSignedInAccountFromIntent(intent)
                handleSignInResult(task)
            }
        }
    }
    */




    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        var fullName by remember { mutableStateOf("Enter name ... ") }
        var emailItem by remember { mutableStateOf("Enter email ...") }
        var passwordItem by remember { mutableStateOf("Enter password ....") }
        var confirmPassword by remember { mutableStateOf("Confirm password ...") }

        // Password visibility
        var passwordvisibility by remember {
            mutableStateOf(false)
        }
        val icon = if (passwordvisibility)
            painterResource(id = R.drawable.design_ic_visibility)
        else
            painterResource(id = R.drawable.design_ic_visibility_off)

        // Welcome Banner
        Text(
            text = "Sign Up",
            style = TextStyle(
                fontSize = 40.sp,
                fontFamily = FontFamily.SansSerif
            )
        )
        Spacer(modifier = Modifier.padding(30.dp))

        // Full name
        OutlinedTextField(
            value = fullName,
            onValueChange = { newText -> {
                fullName = newText
            }
            },
            label = {
                Text(text = "Name:")
            },
            singleLine = true,
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Person,
                        contentDescription ="Profile" )

                }
            },
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Check,
                        contentDescription ="Check" )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Go
            ),
            keyboardActions = KeyboardActions(
                onGo = {
                    Log.d("ImeAction", "Clicked")
                }
            )
        )
        Spacer(modifier = Modifier.padding(10.dp))
        // Email
        OutlinedTextField(value = emailItem, onValueChange = { newText ->
            {
                emailItem = newText
            }
        }, label = {
            Text(text = "Email:")
        }, singleLine = true, leadingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email"
                )

            }
        }, trailingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Check"
                )
            }
        }, keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Go
        )
        )
        Spacer(modifier = Modifier.padding(10.dp))
        OutlinedTextField(
            value = passwordItem,
            onValueChange = { newText -> {
                passwordItem = newText
            }
            },
            label = {
                Text(text = "Confirm Password")
            },
            singleLine = true,
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Lock,
                        contentDescription ="Password" )

                }
            },
            trailingIcon = {
                IconButton(onClick = {
                    passwordvisibility = !passwordvisibility
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Visibility Icon")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Go
            )
        )
        Spacer(modifier = Modifier.padding(10.dp))

        // Confirm password
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { newText -> {
                confirmPassword = newText
            }
            },
            label = {
                Text(text = "Confirm Password")
            },
            singleLine = true,
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Lock,
                        contentDescription ="Password" )

                }
            },
            trailingIcon = {
                IconButton(onClick = {
                    passwordvisibility = !passwordvisibility
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Visibility Icon")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Go
            )
        )
        Spacer(modifier = Modifier.padding(10.dp))
        // Created Button Called Here
        GradientButton(text = "Sign Up", textColor = Color.White, gradient = Brush.horizontalGradient(
            colors = listOf(
                color1, color2
            )
        )) {  }

        Spacer(modifier = Modifier.padding(20.dp))
        Row {
            Text(text = "Already have an Account?")
            // Already have an account Call
            ClickableText(
                text = AnnotatedString("Log in"),
                onClick = { navController.navigate(Routes.Login.route) },
                modifier = Modifier.padding(start = 5.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    textDecoration = TextDecoration.None,
                    color = Purple500
                )
            )

        }
        
        /*
        Text(text = "Sign in with Google")
        Button(
            onClick = {
                startForResult.launch(googleSignInClient?.signInIntent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            shape = Shapes.medium,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black,
                contentColor = Color.White
            )
        ) {
            Image(
                painter = painterResource(id = R.drawable.login_img),
                contentDescription = ""
            )
            Text(text = "Sign In with Google", modifier = Modifier.padding(6.dp))
            
            
        }
        */


        Spacer(modifier = Modifier.padding(5.dp))

        // TODO Bottom Image

    }
}