package hr.ferit.sumigaborna.mycv.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ContentView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.sumigaborna.mycv.MainActivity
import hr.ferit.sumigaborna.mycv.R
import hr.ferit.sumigaborna.mycv.RecyclerView.Adapter.EducationAdapter
import hr.ferit.sumigaborna.mycv.RecyclerView.Repository.EducationRepository
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.education.*

class Education: Fragment() {

    companion object {
        fun newInstance(): Education {
            return Education()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.education,container,false)
        educationDisplay.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        educationDisplay.itemAnimator = DefaultItemAnimator()
        educationDisplay.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))
        return view
    }

}