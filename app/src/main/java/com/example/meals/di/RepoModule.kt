package com.example.meals.di

import com.example.data.remote.ApiService
import com.example.data.repo.MealsRepoImpl
import com.example.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

//todo @Module To Make Retrofit knows this module | @Singleton to use this across the whole app
@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideRepo(apiService: ApiService) : MealsRepo{
        return MealsRepoImpl(apiService)
    }
}