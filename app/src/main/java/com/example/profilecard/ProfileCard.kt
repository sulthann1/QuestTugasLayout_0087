package com.example.profilecard

import android.telephony.ims.SipDetails
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileCard(
    backgroundColors: Color,
    name: String,
    phone: String? = null,
    detail: String,
    nameFontFamily: FontFamily = FontFamily.Default
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(85.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColors)
    ){
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(45.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp)
            ){
                Text(
                    text = name,
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = nameFontFamily
                )
                if (!phone.isNullOrEmpty()){
                    Text(
                        text = phone,
                        color = colorResource(id = R.color.text_phone),
                        fontSize = 13.sp
                    )
                }
                Text(
                    text = detail,
                    color = Color.White,
                    fontSize = 13.sp
                )
            }
            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(45.dp)
            )
        }
    }
}