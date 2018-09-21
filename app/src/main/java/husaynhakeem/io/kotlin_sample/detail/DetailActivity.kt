package husaynhakeem.io.kotlin_sample.detail

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import husaynhakeem.io.kotlin_sample.R
import husaynhakeem.io.kotlin_sample.databinding.ActivityDetailBinding
import husaynhakeem.io.kotlin_sample.model.Person

/**
 * Created by husaynhakeem on 10/5/17.
 */
class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityDetailBinding>(this, R.layout.activity_detail)

        val person = intent.getParcelableExtra("person") as Person
        val factory = DetailViewModelFactory(person)
        binding.detailViewModel = ViewModelProviders.of(this, factory).get(DetailViewModel::class.java)
    }
}