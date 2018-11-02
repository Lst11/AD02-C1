package com.gmail.superarch.presentation.screen.person

import android.view.View
import com.gmail.superarch.R
import com.gmail.superarch.presentation.base.BaseRouter
import com.gmail.superarch.presentation.screen.person.details.PersonDetailsFragment
import com.gmail.superarch.presentation.screen.person.list.StudentListFragment

class PersonRouter(activity: PersonActivity)
    : BaseRouter<PersonActivity>(activity) {

    fun goToStudentList(){
        replaceFragment(
                activity.supportFragmentManager,
                StudentListFragment.getInstance(),
                R.id.container, false)
    }

    fun goToStudentDetails(id: String) {

        val containerDetails = activity.findViewById<View>(R.id.containerDetails)

        if(containerDetails == null) {
            replaceFragment(
                    activity.supportFragmentManager,
                    PersonDetailsFragment.getInstance(id),
                    R.id.container, true)
        } else {
            replaceFragment(
                    activity.supportFragmentManager,
                    PersonDetailsFragment.getInstance(id),
                    R.id.containerDetails, false)
        }
    }
}