package husaynhakeem.io.kotlin_sample.listing.item

import android.support.v7.widget.RecyclerView
import husaynhakeem.io.kotlin_sample.databinding.ItemPersonBinding
import husaynhakeem.io.kotlin_sample.model.Person

/**
 * Created by husaynhakeem on 10/5/17.
 */
class PersonViewHolder(val binding: ItemPersonBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(person: Person) {
        if (binding.itemPersonViewModel == null) {
            binding.itemPersonViewModel = PersonViewModel(itemView.context, person)
        } else {
            binding.itemPersonViewModel!!.person = person
        }
    }
}