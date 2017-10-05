package husaynhakeem.io.kotlin_sample.utility

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
            return formattedFullName.toString()
        }

        fun formattedBirthday(dob: String) : String {
            return ""
        }

        var LOCATION_SEPARATOR = ", "
        fun formattedLocation(city: String, state: String) = city + LOCATION_SEPARATOR + state
    }
}