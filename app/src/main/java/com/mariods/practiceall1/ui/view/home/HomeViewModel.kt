package com.mariods.practiceall1.ui.view.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mariods.practiceall1.domain.model.CharacterModel
import com.mariods.practiceall1.domain.model.TransformationsListModel
import com.mariods.practiceall1.domain.usecase.GetCharacters
import com.mariods.practiceall1.domain.usecase.GetDetailCharacter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private var getCharacters: GetCharacters,
    private val getDetailCharacter: GetDetailCharacter
) : ViewModel() {

    private val _dragonList = MutableLiveData<List<CharacterModel>>()
    val dragonList: LiveData<List<CharacterModel>> = _dragonList


    fun onCreate() {
        viewModelScope.launch {
            val response = getCharacters()
            _dragonList.postValue(response)
        }
    }

    fun getDetail(idItem: Int) {
        viewModelScope.launch {

            Log.i("DETAIL CHARACTER", idItem.toString())
            val response: List<TransformationsListModel> = getDetailCharacter.invoke(idItem)
            if (response.isNotEmpty()) {
                Log.i("DETAIL CHARACTER", response.first().name.toString())
            }else {
                Log.i("DETAIL CHARACTER", "Esta vacio")
            }
        }
    }


}