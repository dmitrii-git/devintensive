package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage(
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date: Date = Date()
) {
    abstract fun formatMessage(
        id: String,
        from: User?,
        isIncoming: Boolean,
        messageType: Boolean
    )
    companion object AbstractFactory{
        fun makeMessage(
            from : String?,
            chat: String?,
            date: Date? = Date(),
            payload: String?,
            type: Boolean,
            isIncoming: Boolean = false
        ) {
        }
    }
}



