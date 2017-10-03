package husaynhakeem.io.kotlin_sample.listing

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import husaynhakeem.io.kotlin_sample.data.Person
import husaynhakeem.io.kotlin_sample.databinding.ItemPersonBinding

/**
 * Created by husaynhakeem on 10/3/17.
 */

class PersonAdapter(private var people: List<Person>) : RecyclerView.Adapter<PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) =
            PersonViewHolder(ItemPersonBinding.inflate(LayoutInflater.from(parent?.context), parent, false))

    override fun onBindViewHolder(holder: PersonViewHolder?, position: Int) {
        holder?.bind(people.get(position))
    }

    override fun getItemCount(): Int = people.size

    fun replaceData(people: List<Person>) {
        this.people = people
    }
}
