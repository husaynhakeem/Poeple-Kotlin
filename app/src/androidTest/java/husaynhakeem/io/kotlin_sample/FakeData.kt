package husaynhakeem.io.kotlin_sample

import husaynhakeem.io.kotlin_sample.model.*

/**
 * Created by husaynhakeem on 10/6/17.
 */
class FakeData {

    companion object {

        var ANY_GENDER = "some_gender"
        var ANY_EMAIL = "some_email"
        var ANY_BIRTHDAY = "1993-11-20 15:32:21"
        var ANY_REGISTRATION = "some_registration"
        var ANY_PHONE = "some_phone"
        var ANY_CELL = "some_cell"
        var ANY_NAT = "some_nat"

        fun ANY_PERSON() = Person(ANY_GENDER,
                ANY_NAME(),
                ANY_LOCATION(),
                ANY_EMAIL,
                ANY_LOGIN(),
                ANY_BIRTHDAY,
                ANY_REGISTRATION,
                ANY_PHONE,
                ANY_CELL,
                ANY_ID(),
                ANY_PICTURE(),
                ANY_NAT)

        var ANY_TITLE = "some_title"
        var ANY_FIRST = "Husayn"
        var ANY_LAST = "Hakeem"
        fun ANY_NAME() = Name(ANY_TITLE,
                ANY_FIRST,
                ANY_LAST)

        var ANY_STREET = "some_street"
        var ANY_CITY = "some_city"
        var ANY_STATE = "some_state"
        var ANY_POSTCODE = 20000
        fun ANY_LOCATION() = Location(ANY_STREET,
                ANY_CITY,
                ANY_STATE,
                ANY_POSTCODE)

        var ANY_USERNAME = "some_username"
        var ANY_PASSWORD = "some_password"
        var ANY_SALT = "some_salt"
        var ANY_MD5 = "some_md5"
        var ANY_SHA1 = "some_sha1"
        var ANY_SHA256 = "some_sha256"
        fun ANY_LOGIN() = Login(ANY_USERNAME,
                ANY_PASSWORD,
                ANY_SALT,
                ANY_MD5,
                ANY_SHA1,
                ANY_SHA256)

        var ANY_NAME = "some_name"
        var ANY_VALUE = "some_value"
        fun ANY_ID() = Id(ANY_NAME, ANY_VALUE)

        var ANY_LARGE = "some_large"
        var ANY_MEDIUM = "some_medium"
        var ANY_THUMBNAIL = "some_thumbnail"
        fun ANY_PICTURE() = Picture(ANY_LARGE,
                ANY_MEDIUM,
                ANY_THUMBNAIL)
    }
}