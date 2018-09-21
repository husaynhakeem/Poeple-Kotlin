package husaynhakeem.io.kotlin_sample

import husaynhakeem.io.kotlin_sample.model.*

/**
 * Created by husaynhakeem on 10/6/17.
 */
class FakeData {

    companion object {

        var ANY_GENDER = "some_gender"
        var ANY_EMAIL = "some_email"
        var ANY_BIRTHDAY = "1993-11-20T15:32:21Z"
        var ANY_PHONE = "some_phone"
        var ANY_CELL = "some_cell"

        fun ANY_PERSON() = Person(ANY_GENDER,
                ANY_NAME(),
                ANY_LOCATION(),
                ANY_EMAIL,
                ANY_LOGIN(),
                DateAndAge(ANY_BIRTHDAY),
                ANY_PHONE,
                ANY_CELL,
                ANY_ID(),
                ANY_PICTURE())

        var ANY_TITLE = "some_title"
        var ANY_FIRST = "Husayn"
        var ANY_LAST = "Hakeem"
        fun ANY_NAME() = Name(ANY_TITLE,
                ANY_FIRST,
                ANY_LAST)

        var ANY_CITY = "some_city"
        var ANY_STATE = "some_state"
        fun ANY_LOCATION() = Location(ANY_CITY, ANY_STATE)

        var ANY_USERNAME = "some_username"
        fun ANY_LOGIN() = Login(ANY_USERNAME)

        var ANY_NAME = "some_name"
        var ANY_VALUE = "some_value"
        fun ANY_ID() = Id(ANY_NAME, ANY_VALUE)

        var ANY_LARGE = "some_large"
        var ANY_MEDIUM = "some_medium"
        fun ANY_PICTURE() = Picture(ANY_LARGE, ANY_MEDIUM)
    }
}