package com.example.ecommerceapplication.data

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    val imgPath: String = ""
) {
     constructor(): this("","","","")
}
