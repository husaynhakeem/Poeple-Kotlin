package husaynhakeem.io.kotlin_sample.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by husaynhakeem on 10/3/17.
 */
class PersonService {

    var BASE_URL = "http://api.randomuser.me/?results=20&nat=en"
    val personApi: PersonApi

    init {
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        personApi = retrofit.create(PersonApi::class.java)
    }
}