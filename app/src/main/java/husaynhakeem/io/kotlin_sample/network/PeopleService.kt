package husaynhakeem.io.kotlin_sample.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by husaynhakeem on 10/3/17.
 */
class PeopleService {

    private val BASE_URL = "http://api.randomuser.me/?results=20&nat=en"
    val personApi: PeopleApi

    init {
        val gsonConverter = GsonBuilder()
                .setLenient()
                .create()

        val httpClient = OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply { level = Level.BODY })
                .build()

        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gsonConverter))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(httpClient)
                .build()

        personApi = retrofit.create(PeopleApi::class.java)
    }
}