package husaynhakeem.io.kotlin_sample

import android.app.Application
import net.danlew.android.joda.JodaTimeAndroid

/**
 * Created by husaynhakeem on 10/5/17.
 */
class PeopleApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this)
    }
}