package com.gmail.superarch.presentation.screen.person.details

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import com.gmail.superarch.R
import com.gmail.superarch.databinding.FragmentStudentDetailsBinding
import com.gmail.superarch.presentation.base.BaseMvvmFragment
import com.gmail.superarch.presentation.screen.person.PersonRouter

class PersonDetailsFragment : BaseMvvmFragment<PersonDetailsViewModel,
        PersonRouter, FragmentStudentDetailsBinding>() {

    companion object {

        private const val ID_EXTRA = "ID_EXTRA"

        fun getInstance(id: String) : PersonDetailsFragment {
            val fragment = PersonDetailsFragment()
            val bundle = Bundle()
            bundle.putString(ID_EXTRA, id)
            fragment.arguments = bundle
            return fragment
        }

        fun getInstance(): PersonDetailsFragment {
            return this.getInstance()
        }
    }

    override fun prodiveViewModel(): PersonDetailsViewModel {
        return ViewModelProviders.of(this)
                .get(PersonDetailsViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.fragment_student_details
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val id = arguments?.getString(ID_EXTRA)
        if(id != null) {
            viewModel.setStudentId(id)
        } else {
            router?.goBack()
        }
    }
}