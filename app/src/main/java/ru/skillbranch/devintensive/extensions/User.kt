package ru.skillbranch.devintensive.extensions

import java.util.*


data class User(
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false) {


    companion object Factory {
        fun makeUser(fullName: String?): User {
            val firstName = fullName?.substringBefore(' ')
            val lastName = fullName?.substringAfter(' ')
            val id = Math.random()
            val avatar = Math.random()
            return User(id.toString(), firstName, lastName, avatar.toString())


        }

    }




}
