package husaynhakeem.io.kotlin_sample.network

import husaynhakeem.io.kotlin_sample.data.PeopleResult
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Created by husaynhakeem on 10/3/17.
 */
interface PersonApi {

    @GET
    fun getPersonList(@Url url: String): Observable<PeopleResult>
}