package husaynhakeem.io.kotlin_sample.listing

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import husaynhakeem.io.kotlin_sample.data.Person
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * Created by husaynhakeem on 10/3/17.
 */
class ListingViewModel : ViewModel() {

    var personModel: PersonModel = PersonModel()
    var people = MutableLiveData<List<Person>>()
    val isLoading = ObservableField<Boolean>()
    val compositeDisposable = CompositeDisposable()

    fun start() {
        isLoading.set(true)
        val disposable = personModel.getPeople()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onPersonListReceived, this::onPersonListReceptionError)
        compositeDisposable.add(disposable)
    }

    private fun onPersonListReceived(people: List<Person>) {
        isLoading.set(false)
        this.people.value = people
    }

    private fun onPersonListReceptionError(throwable: Throwable) {
        isLoading.set(false)
        Timber.e("Error while fetching the data (people). Cause -> %s", throwable.message)
    }

    fun clear() {
        compositeDisposable.clear()
    }
}