package husaynhakeem.io.kotlin_sample.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory



/**
 * Created by husaynhakeem on 10/3/17.
 */
class PeopleService {

    var BASE_URL = "http://api.randomuser.me/?results=20&nat=en"
    val personApi: PeopleApi

    init {
        val gson = GsonBuilder()
                .setLenient()
                .create()

        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        personApi = retrofit.create(PeopleApi::class.java)
    }
}