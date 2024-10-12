package com.mariods.practiceall1.ui.view.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mariods.practiceall1.domain.model.DragonModel
import com.mariods.practiceall1.domain.usecase.GetCharacters
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private var getCharacters: GetCharacters) : ViewModel() {

    private val _dragonList = MutableLiveData<List<DragonModel>>()
    val dragonList : LiveData<List<DragonModel>> = _dragonList


    fun onCreate(){
        viewModelScope.launch {
            val response = getCharacters()
            _dragonList.postValue(response)
        }
    }



}