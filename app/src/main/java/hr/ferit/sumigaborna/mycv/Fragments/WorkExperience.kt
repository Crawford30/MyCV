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
import hr.ferit.sumigaborna.mycv.RecyclerView.Adapter.WorkExperienceAdapter
import hr.ferit.sumigaborna.mycv.RecyclerView.Repository.WorkRepository
import kotlinx.android.synthetic.main.workexperience.*

class WorkExperience:Fragment (){

    companion object {
        fun newInstance(): WorkExperience {
            return WorkExperience()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.workexperience,container,false)

        return view
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        workexpDisplay.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        workexpDisplay.itemAnimator = DefaultItemAnimator()
        workexpDisplay.addItemDecoration(DividerItemDecoration(activity, RecyclerView.VERTICAL))
        workexpDisplay.adapter = WorkExperienceAdapter(WorkRepository.works)

    }
}