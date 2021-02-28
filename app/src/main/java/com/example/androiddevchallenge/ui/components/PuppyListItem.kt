package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy

@Composable
fun PuppyListItem(puppy: Puppy, onItemClick: () -> Unit) {
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(
                bottom = 6.dp,
                top = 6.dp
            )
            .fillMaxWidth()
            .clickable(onClick = onItemClick),
        elevation = 8.dp
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = puppy.drawableRes),
                contentDescription = puppy.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .padding(6.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
            )

            Column(modifier = Modifier.padding(6.dp)) {
                Text(
                    text = puppy.name,
                    style = MaterialTheme.typography.h6,
                    color = MaterialTheme.colors.onSurface
                )

                Text(
                    text = puppy.age,
                    style = MaterialTheme.typography.subtitle1,
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .alpha(0.5f),
                    color = MaterialTheme.colors.onSurface,
                )

                Text(
                    text = puppy.description,
                    style = MaterialTheme.typography.subtitle2,
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .alpha(0.5f),
                    color = MaterialTheme.colors.onSurface,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}