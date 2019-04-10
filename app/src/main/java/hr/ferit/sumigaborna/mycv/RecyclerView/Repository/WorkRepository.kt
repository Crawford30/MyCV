package hr.ferit.sumigaborna.mycv.RecyclerView.Repository

import hr.ferit.sumigaborna.mycv.RecyclerView.WorkExperience

object WorkRepository {
    val works: MutableList<WorkExperience>
    init {
        works = retrieveWorks()
    }

    private fun retrieveWorks(): MutableList<WorkExperience> {
        return mutableListOf(
            WorkExperience(2019,2019,"FERIT"),
            WorkExperience(2020,2020,"Google")
        )
    }

}