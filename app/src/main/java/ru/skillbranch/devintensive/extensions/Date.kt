package ru.skillbranch.devintensive.extensions

import java.time.Clock
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter


class Date {

    companion object Factory {
        private var date: LocalDateTime? = LocalDateTime.now(Clock.system(ZoneId.of("Europe/Moscow")))

        fun format(pattern: String? = "HH:mm:ss dd.MM.yy"): String? {
            return date?.format(DateTimeFormatter.ofPattern(pattern))
        }

        fun add(value: Long, Units: TimeUnits?): LocalDateTime? {

            return when (Units) {
                TimeUnits.SECOND -> date?.plusSeconds(value)
                TimeUnits.MINUTE -> date?.plusMinutes(value)
                TimeUnits.HOUR -> date?.plusHours(value)
                TimeUnits.DAY -> date?.plusDays(value)
                else -> throw IllegalStateException()
            }


        }

        enum class TimeUnits {
            SECOND, MINUTE, HOUR, DAY
        }

    }
}