package com.gmail.superarch.fuctories

import com.gmail.name.data.repositories.PersonRepositoryImpl
import com.gmail.name.domain.usecases.*
import inkant1990.com.cleanhomes.executor.UIThread

object UseCaseProvider {

    val uiThread = UIThread()


    fun provideGetStudentListUseCase(): GetStudentsUseCase {

        //Берем репозиторий из data слоя (репозиторий имплементирует интерфейс который
        // находится в domain слое)
        val repository = PersonRepositoryImpl()

        // создаем useCase и передаем в коструктор созданный репозиторий(который
        // находится в data слое, но domain не знает что репозиторий из data слоя)

        val useCase = GetStudentsUseCase(repository, uiThread)

        return useCase
    }


    fun provideDeleteStudentUseCase(): DeleteStudentUseCase {
        return DeleteStudentUseCase(PersonRepositoryImpl(), uiThread)
    }

    fun provideUpdateStudentUseCase(): UpdateStudentUseCase {
        return UpdateStudentUseCase(PersonRepositoryImpl(), uiThread)
    }

    fun provideSearchStudentUseCase(): SearchStudentsUseCase {
        return SearchStudentsUseCase(PersonRepositoryImpl(), uiThread)
    }

    fun provideGetPersonUseCase(): GetPersonUseCase {
        return GetPersonUseCase(PersonRepositoryImpl(), uiThread)
    }
}