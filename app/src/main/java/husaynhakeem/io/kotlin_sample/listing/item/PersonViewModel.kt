package husaynhakeem.io.kotlin_sample.listing.item

import android.content.Context
import android.content.Intent
import android.databinding.BaseObservable
import android.databinding.BindingAdapter
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso
import husaynhakeem.io.kotlin_sample.detail.DetailActivity
import husaynhakeem.io.kotlin_sample.model.Person
import husaynhakeem.io.kotlin_sample.utility.TextUtils.Companion.formattedFullName

/**
 * Created by husaynhakeem on 10/5/17.
 */
class PersonViewModel(val context: Context, var person: Person) : BaseObservable() {

    fun getPicture() = person.picture.medium

    fun getFullName() = formattedFullName(arrayOf(person.name.title, person.name.first, person.name.last))

    fun getEmail() = person.email

    fun getPhone() = person.phone

    companion object {
        @JvmStatic
        @BindingAdapter("tools:imageUrl")
        fun loadImage(imageView: ImageView, picture: String) {
            Picasso.with(imageView.context).load(picture).into(imageView)
        }
    }

    fun onClick(view: View) {
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra("person", person)
        context.startActivity(intent)
    }
}
