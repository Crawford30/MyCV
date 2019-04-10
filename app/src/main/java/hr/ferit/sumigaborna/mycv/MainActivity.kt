package hr.ferit.sumigaborna.mycv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.sumigaborna.mycv.Fragments.Education
import hr.ferit.sumigaborna.mycv.Fragments.FragmentAdapter
import hr.ferit.sumigaborna.mycv.RecyclerView.Adapter.EducationAdapter
import hr.ferit.sumigaborna.mycv.RecyclerView.Adapter.WorkExperienceAdapter
import hr.ferit.sumigaborna.mycv.RecyclerView.Repository.EducationRepository
import hr.ferit.sumigaborna.mycv.RecyclerView.Repository.WorkRepository
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.education.*
import kotlinx.android.synthetic.main.workexperience.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpUi()
    }

    private fun setUpUi() {
        viewPager.adapter = FragmentAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)


        //displayData()

    }

    fun displayData() {

        educationDisplay.adapter = EducationAdapter(EducationRepository.educations)
        //workexpDisplay.adapter = WorkExperienceAdapter(WorkRepository.works)
    }
}
