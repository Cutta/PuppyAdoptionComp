package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.samplePuppyList
import com.example.androiddevchallenge.ui.components.PuppyListItem

@Composable
fun ListScreen(navController: NavController) {
    val puppyList: List<Puppy> = samplePuppyList
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        itemsIndexed(
            items = puppyList
        ) { index, _ ->
            PuppyListItem(puppyList[index]) {
                navController.navigate("detail_screen/$index")
            }
        }
    }
}