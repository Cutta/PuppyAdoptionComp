package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class Puppy(
    val id: Int,
    @DrawableRes val drawableRes: Int,
    val name: String,
    val age: String,
    val gender: Gender,
    val description: String
)

enum class Gender {
    Female, Male
}

val samplePuppyList = listOf(
    Puppy(
        id = 1,
        drawableRes = R.drawable.kaptan,
        name = "Kaptan",
        age = "2 months old",
        gender = Gender.Female,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    ),
    Puppy(
        id = 2,
        drawableRes = R.drawable.pati,
        name = "Pati",
        age = "6 months old",
        gender = Gender.Male,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    ),
    Puppy(
        id = 3,
        drawableRes = R.drawable.zeytin,
        name = "Zeytin",
        age = "5 months old",
        gender = Gender.Female,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    ),
    Puppy(
        id = 4,
        drawableRes = R.drawable.patron,
        name = "Patron",
        age = "3 months old",
        gender = Gender.Male,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    ),
    Puppy(
        id = 5,
        drawableRes = R.drawable.sezar,
        name = "Sezar",
        age = "3 months old",
        gender = Gender.Female,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    ),
    Puppy(
        id = 6,
        drawableRes = R.drawable.lokum,
        name = "Lokum",
        age = "3 months old",
        gender = Gender.Female,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    ),
    Puppy(
        id = 7,
        drawableRes = R.drawable.melo,
        name = "Melo",
        age = "6 months old",
        gender = Gender.Female,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    ),
    Puppy(
        id = 8,
        drawableRes = R.drawable.gofret,
        name = "Gofret",
        age = "6 months old",
        gender = Gender.Female,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    ),
    Puppy(
        id = 9,
        drawableRes = R.drawable.duman,
        name = "Duman",
        age = "6 months old",
        gender = Gender.Female,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    ),
    Puppy(
        id = 10,
        drawableRes = R.drawable.korsan,
        name = "Korsan",
        age = "6 months old",
        gender = Gender.Female,
        description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"
    )
)
