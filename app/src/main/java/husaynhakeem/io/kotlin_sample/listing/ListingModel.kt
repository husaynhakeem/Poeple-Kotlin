package husaynhakeem.io.kotlin_sample.listing

import husaynhakeem.io.kotlin_sample.network.PeopleService

/**
 * Created by husaynhakeem on 10/3/17.
 */
class ListingModel {

    var EMPTY_URL = ""
    fun getPeople() = PeopleService().personApi.getPersonList(EMPTY_URL)
}