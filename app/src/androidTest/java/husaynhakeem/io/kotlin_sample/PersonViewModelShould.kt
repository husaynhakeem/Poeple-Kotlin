package husaynhakeem.io.kotlin_sample

import android.support.test.InstrumentationRegistry
import husaynhakeem.io.kotlin_sample.FakeData.Companion.ANY_PERSON
import husaynhakeem.io.kotlin_sample.listing.item.PersonViewModel
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by husaynhakeem on 10/6/17.
 */
class PersonViewModelShould {

    private val context = InstrumentationRegistry.getTargetContext()
    private val person = ANY_PERSON()
    private lateinit var personViewModel: PersonViewModel

    @Before
    fun setUp() {
        personViewModel = PersonViewModel(context, person)
    }

    @Test
    fun returnCorrectFullName() {
        val fullName = personViewModel.getFullName()
        assertEquals("Some_title Husayn Hakeem", fullName)
    }

    @Test
    fun returnCorrectPicture() {
        val picture = personViewModel.getPicture()
        assertEquals("some_medium", picture)
    }

    @Test
    fun returnCorrectEmail() {
        val email = personViewModel.getEmail()
        assertEquals("some_email", email)
    }

    @Test
    fun returnCorrectPhone() {
        val phone = personViewModel.getPhone()
        assertEquals("some_phone", phone)
    }
}