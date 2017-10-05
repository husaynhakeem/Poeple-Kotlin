package husaynhakeem.io.kotlin_sample.detail

import android.arch.lifecycle.ViewModel
import husaynhakeem.io.kotlin_sample.model.Person
import husaynhakeem.io.kotlin_sample.utility.TextUtils.Companion.formattedBirthday
import husaynhakeem.io.kotlin_sample.utility.TextUtils.Companion.formattedFullName
import husaynhakeem.io.kotlin_sample.utility.TextUtils.Companion.formattedLocation

/**
 * Created by husaynhakeem on 10/5/17.
 */
class DetailViewModel(var person: Person) : ViewModel() {

    fun getFullName() = formattedFullName(arrayOf(person.name.first, person.name.last))

    fun getPicture() = person.picture.large

    fun getUsername() = person.login.username

    fun getGender() = person.gender

    fun getBirthday() = formattedBirthday(person.dob)

    fun getLocation() = formattedLocation(person.location.city, person.location.state)

    fun getEmail() = person.email

    fun getPhone() = person.phone

    fun getCell() = person.cell
}
