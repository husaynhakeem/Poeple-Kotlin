package husaynhakeem.io.kotlin_sample.data

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
             val nat: String)

class Name(val title: String,
           val first: String,
           val last: String)

class Location(val street: String,
               val city: String,
               val state: String,
               val postcode: Int)

class Login(val username: String,
            val password: String,
            val salt: String,
            val md5: String,
            val sha1: String,
            val sha256: String)

class Id(val name: String,
         val value: String)

class Picture(val large: String,
              val medium: String,
              val thumbnail: String)

class Metadata(val seed: String,
               val results: Int,
               val page: Int,
               val version: String)