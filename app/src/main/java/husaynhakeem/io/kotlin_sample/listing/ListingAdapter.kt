package husaynhakeem.io.kotlin_sample.listing

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import husaynhakeem.io.kotlin_sample.R
import husaynhakeem.io.kotlin_sample.databinding.ItemPersonBinding
import husaynhakeem.io.kotlin_sample.listing.item.PersonViewHolder
import husaynhakeem.io.kotlin_sample.model.Person

/**
 * Created by husaynhakeem on 10/3/17.
 */

class ListingAdapter(var people: List<Person>) : RecyclerView.Adapter<PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemPersonBinding = DataBindingUtil.inflate<ItemPersonBinding>(layoutInflater, R.layout.item_person, parent, false)
        return PersonViewHolder(itemPersonBinding)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(people.get(position))
    }

    override fun getItemCount(): Int = people.size

    override fun getItemViewType(position: Int) = position

    fun replaceData(people: List<Person>) {
        this.people = people
    }
}
