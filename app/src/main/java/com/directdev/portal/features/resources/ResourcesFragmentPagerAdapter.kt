package com.directdev.portal.features.resources

import android.app.Fragment
import android.app.FragmentManager
import android.support.v13.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter

/**-------------------------------------------------------------------------------------------------
 * Created by chris on 10/15/17.
 *------------------------------------------------------------------------------------------------*/
class ResourcesFragmentPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    private val fragmentList = mutableListOf<Fragment>()
    private val fragmentTitleList = mutableListOf<String>()

    override fun getItem(position: Int) = fragmentList[position]

    override fun getCount() = fragmentList.size

    fun addFrag(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }

    fun clear() {
        fragmentTitleList.clear()
        fragmentList.clear()
    }

    // TODO: This might be the wrong POSITION_NONE
    override fun getItemPosition(`object`: Any): Int {
        return PagerAdapter.POSITION_NONE
    }

    override fun getPageTitle(position: Int): CharSequence = fragmentTitleList[position]
}