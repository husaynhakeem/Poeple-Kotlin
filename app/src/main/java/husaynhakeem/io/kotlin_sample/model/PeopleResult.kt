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
             val dob: String,
             val registered: String,
             val phone: String,
             val cell: String,
             val id: Id,
             val picture: Picture,
             val nat: String): Serializable

class Name(val title: String,
           val first: String,
           val last: String): Serializable

class Location(val street: String,
               val city: String,
               val state: String,
               val postcode: Int): Serializable

class Login(val username: String,
            val password: String,
            val salt: String,
            val md5: String,
            val sha1: String,
            val sha256: String): Serializable

class Id(val name: String,
         val value: String): Serializable

class Picture(val large: String,
              val medium: String,
              val thumbnail: String): Serializable

class Metadata(val seed: String,
               val results: Int,
               val page: Int,
               val version: String)