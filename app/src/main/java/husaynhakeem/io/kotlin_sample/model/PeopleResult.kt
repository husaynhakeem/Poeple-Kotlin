package husaynhakeem.io.kotlin_sample.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by husaynhakeem on 10/3/17.
 */
class PeopleResult(val results: List<Person>,
                   val info: Metadata)

@Parcelize
class Person(val gender: String,
             val name: Name,
             val location: Location,
             val email: String,
             val login: Login,
             val dob: DateAndAge,
             val phone: String,
             val cell: String,
             val id: Id,
             val picture: Picture) : Parcelable

@Parcelize
class Name(val title: String,
           val first: String,
           val last: String) : Parcelable

@Parcelize
class Location(val city: String,
               val state: String) : Parcelable

@Parcelize
class Login(val username: String) : Parcelable

@Parcelize
class DateAndAge(val date: String) : Parcelable

@Parcelize
class Id(val name: String,
         val value: String) : Parcelable

@Parcelize
class Picture(val large: String,
              val medium: String) : Parcelable

class Metadata(val version: String)