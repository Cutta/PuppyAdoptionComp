package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.data.samplePuppyList

@Composable
fun DetailScreen(navController: NavController?, puppyId: String?) {
    val puppy = samplePuppyList[puppyId?.toInt()!!]
    Column {
        TopAppBar(
            title = { Text(text = puppy.name) },
            navigationIcon = {
                IconButton(onClick = { navController?.popBackStack() }) {
                    Icon(Icons.Outlined.ArrowBack, "back")
                }
            }
        )
        Image(
            painter = painterResource(id = puppy.drawableRes),
            contentDescription = puppy.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.aspectRatio(1f)
        )

        Text(
            text = "Name: ${puppy.name}",
            modifier = Modifier.padding(6.dp),
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.primary
        )
        Text(
            text = "Age: ${puppy.age}",
            modifier = Modifier.padding(start = 6.dp, top = 6.dp)
        )
        Text(
            text = "Description: ${puppy.description}",
            modifier = Modifier.padding(start = 6.dp, top = 6.dp)
        )
    }

}