package com.example.meals.di

import com.example.domain.repo.MealsRepo
import com.example.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

//todo @Module To Make Retrofit knows this module | @Singleton to use this across the whole app
@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(mealsRepo: MealsRepo) : GetMeals{
        return GetMeals(mealsRepo)
    }
}