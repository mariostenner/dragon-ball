package com.mariods.practiceall1.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariods.practiceall1.data.model.DragonModel
import com.mariods.practiceall1.data.model.DragonProvider.Companion.DragonDummyList
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DragonViewModel @Inject constructor() : ViewModel() {

    private val _dragonList = MutableLiveData<List<DragonModel>>(DragonDummyList)
    val dragonList : LiveData<List<DragonModel>> = _dragonList



}