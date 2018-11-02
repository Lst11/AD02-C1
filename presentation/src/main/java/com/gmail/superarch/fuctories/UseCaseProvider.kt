package com.gmail.superarch.fuctories

import com.gmail.name.data.repositories.PersonRepositoryImpl
import com.gmail.name.domain.usecases.*

object UseCaseProvider {

    fun provideGetStudentListUseCase() : GetStudentsUseCase {

        //Берем репозиторий из data слоя (репозиторий имплементирует интерфейс который
        // находится в domain слое)
        val repository = PersonRepositoryImpl()

        // создаем useCase и передаем в коструктор созданный репозиторий(который
        // находится в data слое, но domain не знает что репозиторий из data слоя)

        val useCase = GetStudentsUseCase(repository)

        return useCase
    }


    fun provideDeleteStudentUseCase() : DeleteStudentUseCase {
        return DeleteStudentUseCase(PersonRepositoryImpl())
    }

    fun provideUpdateStudentUseCase() : UpdateStudentUseCase {
        return UpdateStudentUseCase(PersonRepositoryImpl())
    }

    fun provideSearchStudentUseCase() : SearchStudentsUseCase {
        return SearchStudentsUseCase(PersonRepositoryImpl())
    }

    fun provideGetPersonUseCase() : GetPersonUseCase {
        return GetPersonUseCase(PersonRepositoryImpl())
    }
}