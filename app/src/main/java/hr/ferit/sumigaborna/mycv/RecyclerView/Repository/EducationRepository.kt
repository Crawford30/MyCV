package hr.ferit.sumigaborna.mycv.RecyclerView.Repository

import hr.ferit.sumigaborna.mycv.RecyclerView.Education

object EducationRepository {
    val educations: MutableList<Education>
    init {
        educations = retrieveEducations()
    }

    private fun retrieveEducations(): MutableList<Education> {
        return mutableListOf(
            Education(2002,2010,"OSnovna"),
            Education(2010,2014,"Srednja")
        )
    }
}