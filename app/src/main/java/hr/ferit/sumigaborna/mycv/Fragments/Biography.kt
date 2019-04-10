package hr.ferit.sumigaborna.mycv.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.sumigaborna.mycv.R
import kotlinx.android.synthetic.main.education.*

class Biography: Fragment() {

    companion object {
        fun newInstance(): Biography {
            return Biography()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val view = inflater.inflate(R.layout.biography,container,false)
        return view
    }
}