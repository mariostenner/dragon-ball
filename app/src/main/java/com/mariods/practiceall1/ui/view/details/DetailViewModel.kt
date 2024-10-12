package com.mariods.practiceall1.ui.view.details

import androidx.lifecycle.ViewModel
import com.mariods.practiceall1.domain.usecase.GetDetailCharacter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val getDetailCharacter: GetDetailCharacter) :
    ViewModel() {
    //private val _detailCharacter = MutableLiveData<List<CharacterDetailModel>>()
    //val detailCharacter = _detailCharacter


}