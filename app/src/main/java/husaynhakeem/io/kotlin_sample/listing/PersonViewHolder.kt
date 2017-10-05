package husaynhakeem.io.kotlin_sample.listing

import android.content.Context
import android.support.v7.widget.RecyclerView
import com.squareup.picasso.Picasso
import husaynhakeem.io.kotlin_sample.data.Person
import husaynhakeem.io.kotlin_sample.databinding.ItemPersonBinding

/**
 * Created by husaynhakeem on 10/3/17.
 */
class PersonViewHolder : RecyclerView.ViewHolder {

    lateinit var binding: ItemPersonBinding
    lateinit var context: Context

    constructor(binding: ItemPersonBinding) : super(binding.root) {
        this.binding = binding
        this.context = binding.root.context
    }

    fun bind(person: Person) {
        Picasso.with(context).load(person.picture.medium).into(binding.ivPerson)
        binding.person = person;
        binding.executePendingBindings();
    }
}