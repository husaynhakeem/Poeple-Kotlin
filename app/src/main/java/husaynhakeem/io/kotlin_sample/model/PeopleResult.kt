package husaynhakeem.io.kotlin_sample.model

import java.io.Serializable

/**
 * Created by husaynhakeem on 10/3/17.
 */
class PeopleResult(val results: List<Person>,
                   val info: Metadata)

class Person(val gender: String,
             val name: Name,
             val location: Location,
             val email: String,
             val login: Login,
             val dob: DateAndAge,
             val phone: String,
             val cell: String,
             val id: Id,
             val picture: Picture) : Serializable

class Name(val title: String,
           val first: String,
           val last: String) : Serializable

class Location(val city: String,
               val state: String) : Serializable

class Login(val username: String) : Serializable

class DateAndAge(val date: String,
                 val age: Int) : Serializable

class Id(val name: String,
         val value: String) : Serializable

class Picture(val large: String,
              val medium: String) : Serializable

class Metadata(val version: String)