package com.gmail.superarch.fuctories

import android.content.Context
import com.gmail.superarch.presentation.screen.person.details.PersonDetailsFragment

object ContexProvider {
    fun providePersonDetailContex() : Context? {
        return PersonDetailsFragment()?.context
    }
}