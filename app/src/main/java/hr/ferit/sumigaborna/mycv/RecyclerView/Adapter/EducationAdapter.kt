package hr.ferit.sumigaborna.mycv.RecyclerView.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.sumigaborna.mycv.R
import hr.ferit.sumigaborna.mycv.RecyclerView.Education
import kotlinx.android.synthetic.main.item_education.view.*

class EducationAdapter(
    educations: MutableList<Education>
):RecyclerView.Adapter<EducationHolder>(){
    private val educations: MutableList<Education>
    init {
        this.educations = mutableListOf()
        this.educations.addAll(educations)
    }
    fun RefreshData(educations:MutableList<Education>){
        this.educations.clear()
        this.educations.addAll(educations)
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int = educations.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationHolder {
        val educationView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_education,parent,false)
        val educationHolder = EducationHolder(educationView)
        return educationHolder
    }

    override fun onBindViewHolder(holder: EducationHolder, position: Int) {
        val education = educations[position]
        holder.bind(education)
    }
}

class EducationHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    fun bind(education: Education){
        itemView.tvEducationStart.text = education.YearStart.toString()
        itemView.tvEducationEnd.text = education.YearFinish.toString()
        itemView.tvEducationFaculty.text = education.FacultyName
    }
}