package hr.ferit.sumigaborna.mycv.RecyclerView.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.sumigaborna.mycv.R
import hr.ferit.sumigaborna.mycv.RecyclerView.WorkExperience
import kotlinx.android.synthetic.main.item_workexp.view.*

class WorkExperienceAdapter(
    works: MutableList<WorkExperience>
): RecyclerView.Adapter<WorkExperienceHolder>(){
    private val works: MutableList<WorkExperience>
    init {
        this.works = mutableListOf()
        this.works.addAll(works)
    }
    fun RefreshData(works:MutableList<WorkExperience>){
        this.works.clear()
        this.works.addAll(works)
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int = works.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkExperienceHolder {
        val WorkExperienceView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_workexp,parent,false)
        val WorkExperienceHolder =
            WorkExperienceHolder(WorkExperienceView)
        return WorkExperienceHolder
    }

    override fun onBindViewHolder(holder: WorkExperienceHolder, position: Int) {
        val WorkExperience = works[position]
        holder.bind(WorkExperience)
    }
}

class WorkExperienceHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    fun bind(work: WorkExperience){
        itemView.tvWorkStart.text = work.YearStart.toString()
        itemView.tvWorkEnd.text = work.YearFinish.toString()
        itemView.tvWorkEmployer.text = work.EmployerName
    }
}