package husaynhakeem.io.kotlin_sample.detail

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import husaynhakeem.io.kotlin_sample.model.Person

/**
 * Created by husaynhakeem on 10/5/17.
 */
class DetailViewModelFactory(private var person: Person) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java))
            return DetailViewModel(person) as T
        throw IllegalArgumentException("Unknown viewModel class")
    }
}