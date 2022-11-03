package com.example.myapplication

import android.content.res.Resources.Theme
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Purple40
import com.example.myapplication.ui.theme.orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Scaffold(
    ) {
        Box(){
            Column(
                modifier = if (isSystemInDarkTheme()){
                    Modifier
                        .background(
                            color = orange
                        )
                        .fillMaxWidth()
                        .fillMaxHeight(0.2f)
                } else {
                    Modifier
                        .background(
                            color = Purple40
                        )
                        .fillMaxWidth()
                        .fillMaxHeight(0.2f)
                },
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Row() {
                    Text(
                        text = stringResource(id = R.string.profile),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                }
            }
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(20.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(0.8f)
                ,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val uriHandler = LocalUriHandler.current
                Spacer(modifier = Modifier.height(50.dp))
                Image(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .height(300.dp)
                    ,
                    painter = painterResource(id = R.mipmap.profile),
                    contentDescription ="profile picture"
                )
                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = 5.dp
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                    ) {
                        Row() {
                            Text(
                                text = stringResource(id = R.string.name),
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                            Text(
                                text = "Benjamin Muthui",
                                fontFamily = FontFamily.Monospace,
                                color = Color.Black
                            )
                        }
                        Row() {
                            Text(
                                text = stringResource(id = R.string.title),
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                            Text(
                                text = stringResource(id = R.string.mobile),
                                fontFamily = FontFamily.Monospace,
                                color = Color.Black
                            )
                        }
                        Row() {
                            Text(
                                text = stringResource(id = R.string.user_name),
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                            Text(
                                text = "Benjamin Muthui",
                                fontFamily = FontFamily.Monospace,
                                color = Color.Black
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = 5.dp
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                    ) {
                        Text(
                            text = stringResource(id = R.string.about),
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text(
                            text = stringResource(id = R.string.about_description),
                            fontFamily = FontFamily.Monospace,
                            color = Color.Black
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = 5.dp
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                    ) {
                        Text(
                            text = stringResource(id = R.string.what_i_can_do_for_the_company),
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text(
                            text = stringResource(id = R.string.what_i_can_do_for_the_company_description),
                            fontFamily = FontFamily.Monospace,
                            color = Color.Black
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = 5.dp
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Text(text = "Social Media Links:",
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text(
                            modifier = Modifier.clickable {
                                uriHandler.openUri("https://www.instagram.com/muthui.__/") },
                            text = "Instagram Link",
                            color = Color.Blue,
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = 5.dp
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Text(text = "Automatic dark theme supported",
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text(text = "Both English and Kiswahili supported",
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}