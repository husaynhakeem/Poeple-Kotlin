package husaynhakeem.io.kotlin_sample.utility

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

/**
 * Created by husaynhakeem on 10/5/17.
 */
class TextUtils {

    companion object {
        var SPACE = " "
        var FIRST_LETTER_INDEX = 0
        var SECOND_LETTER_INDEX = 1
        fun formattedFullName(words: Array<String>): String {
            val formattedFullName = StringBuilder()
            words.forEach { word ->
                run {
                    formattedFullName.append(word[FIRST_LETTER_INDEX].toUpperCase() + word.substring(SECOND_LETTER_INDEX, word.length))
                    formattedFullName.append(SPACE)
                }
            }
            return formattedFullName.toString().trim()
        }

        var SEPARATOR = ", "
        fun formattedLocation(city: String, state: String) = city + SEPARATOR + state

        fun formattedBirthday(birthday: String) : String {
            val dateTimeFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
            val dateTime = DateTime.parse(birthday, dateTimeFormat)
            return dateTime.dayOfMonth().asString + SEPARATOR +
                    dateTime.monthOfYear().getAsText() + SPACE +
                    dateTime.year
        }
    }
}