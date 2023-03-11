package com.example.meals

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.CategoryResponse
import com.example.domain.usecase.GetMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealsUseCase: GetMeals
) : ViewModel() {

    private val _categories : MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
    val categories : StateFlow<CategoryResponse?> = _categories

    fun getMeals() {
        //todo This "Coroutines Scope" because of that suspended fun (GetMeals)
        viewModelScope.launch {
            //todo (Try & Catch) for wrapping any error will happen
            try {
                _categories.value = getMealsUseCase()
            } catch (e: java.lang.Exception) {
                Log.e("MealsViewModel", e.message.toString())
            }
        }
    }

}