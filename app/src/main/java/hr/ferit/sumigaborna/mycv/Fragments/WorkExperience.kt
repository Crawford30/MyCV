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
import kotlinx.android.synthetic.main.workexperience.*

class WorkExperience:Fragment (){

    companion object {
        fun newInstance(): WorkExperience {
            return WorkExperience()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.workexperience,container,false)
        workexpDisplay.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        workexpDisplay.itemAnimator = DefaultItemAnimator()
        workexpDisplay.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))
        return view
    }
}