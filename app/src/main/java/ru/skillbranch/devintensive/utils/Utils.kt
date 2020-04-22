package ru.skillbranch.devintensive.utils

class Utils {
    fun parseFullName(fullName: String): Pair<String, String> {
        val firstName = fullName?.substringBefore(' ')
        val lastName = fullName?.substringAfter(' ')
        return Pair(firstName, lastName)
    }
}