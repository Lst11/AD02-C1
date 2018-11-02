package com.gmail.superarch.presentation.screen.person.list

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import com.gmail.superarch.R
import com.gmail.superarch.databinding.FragmentStudentListBinding
import com.gmail.superarch.presentation.base.BaseMvvmFragment
import com.gmail.superarch.presentation.screen.person.PersonRouter
import com.jakewharton.rxbinding2.widget.RxTextView
import io.reactivex.rxkotlin.subscribeBy
import java.util.concurrent.TimeUnit

class StudentListFragment : BaseMvvmFragment<StudentListViewModel,
        PersonRouter, FragmentStudentListBinding>() {

    companion object {

        fun getInstance() : StudentListFragment {
            return StudentListFragment()
        }
    }

    override fun prodiveViewModel(): StudentListViewModel {
        return ViewModelProviders.of(this)
                .get(StudentListViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.fragment_student_list
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listRecyclerView.adapter = viewModel.adapter
        binding.listRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.listRecyclerView.setHasFixedSize(true)

        RxTextView.textChanges(binding.searchEditText)
                .throttleFirst(500L, TimeUnit.MILLISECONDS)
                .subscribeBy {
                    Log.e("aaa","StudentListFragment: text to search is $it")
                    viewModel.search(it.toString())
                }
    }
}