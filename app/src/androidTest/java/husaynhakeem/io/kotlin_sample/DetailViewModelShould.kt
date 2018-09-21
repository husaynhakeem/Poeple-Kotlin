package husaynhakeem.io.kotlin_sample

import husaynhakeem.io.kotlin_sample.detail.DetailViewModel
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by husaynhakeem on 10/6/17.
 */
class DetailViewModelShould {

    private val person = FakeData.ANY_PERSON()
    private lateinit var detailViewModel: DetailViewModel

    @Before
    fun setUp() {
        detailViewModel = DetailViewModel(person)
    }

    @Test
    fun returnCorrectFullName() {
        val fullName = detailViewModel.getFullName()
        assertEquals("Husayn Hakeem", fullName)
    }

    @Test
    fun returnCorrectPicture() {
        val picture = detailViewModel.getPicture()
        assertEquals("some_large", picture)
    }

    @Test
    fun returnCorrectUsername() {
        val userName = detailViewModel.getUsername()
        assertEquals("some_username", userName)
    }

    @Test
    fun returnCorrectGender() {
        val gender = detailViewModel.getGender()
        assertEquals("some_gender", gender)
    }

    @Test
    fun returnCorrectBirthday() {
        val birthday = detailViewModel.getBirthday()
        assertEquals("20, November 1993", birthday)
    }

    @Test
    fun returnCorrectLocation() {
        val userName = detailViewModel.getLocation()
        assertEquals("some_city, some_state", userName)
    }

    @Test
    fun returnCorrectEmail() {
        val email = detailViewModel.getEmail()
        assertEquals("some_email", email)
    }

    @Test
    fun returnCorrectPhone() {
        val phone = detailViewModel.getPhone()
        assertEquals("some_phone", phone)
    }

    @Test
    fun returnCorrectCell() {
        val cell = detailViewModel.getCell()
        assertEquals("some_cell", cell)
    }
}