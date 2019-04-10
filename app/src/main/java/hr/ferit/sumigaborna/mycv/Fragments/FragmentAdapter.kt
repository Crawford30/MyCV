package hr.ferit.sumigaborna.mycv.Fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentAdapter(fragmentManager : FragmentManager):FragmentPagerAdapter(fragmentManager) {

    val fragments = arrayOf(
        Biography.newInstance(),
        Education.newInstance(),
        WorkExperience.newInstance()
    )
    val titles = arrayOf("Biography","Education","Work experience")

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }
}