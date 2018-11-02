package com.gmail.superarch.presentation.screen.person

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.gmail.superarch.R
import com.gmail.superarch.databinding.ActivityPersonBinding
import com.gmail.superarch.presentation.base.BaseMvvmActivity

class PersonActivity : BaseMvvmActivity<
        PersonViewModel,
        PersonRouter,
        ActivityPersonBinding>() {

    override fun prodiveViewModel(): PersonViewModel {
        return ViewModelProviders.of(this)
                .get(PersonViewModel::class.java)
    }

    override fun provideRouter(): PersonRouter {
        return PersonRouter(this)
    }

    override fun provideLayoutId(): Int = R.layout.activity_person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(savedInstanceState == null) {
            router.goToStudentList()
        }
    }
}