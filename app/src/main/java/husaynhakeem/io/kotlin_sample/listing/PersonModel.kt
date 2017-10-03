package husaynhakeem.io.kotlin_sample.listing

import husaynhakeem.io.kotlin_sample.network.PersonService

/**
 * Created by husaynhakeem on 10/3/17.
 */
class PersonModel {

    fun getPeople() = PersonService().personApi.getPersonList("")
}