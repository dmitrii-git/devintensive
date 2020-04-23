package ru.skillbranch.devintensive.utils

class Utils {
    companion object Factory {
        fun parseFullName(fullName: String? = null): Pair<String?, String?> {
            var firstName = fullName?.substringBefore(' ')
            var lastName = fullName?.substringAfter(' ')
            if(firstName == lastName) lastName = "null"
            if(firstName == "") firstName = "null"
            return Pair(firstName, lastName)

        }
   }
}