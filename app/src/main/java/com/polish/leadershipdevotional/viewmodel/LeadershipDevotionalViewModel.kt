package com.polish.leadershipdevotional.viewmodel

import androidx.lifecycle.*
import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity
import com.polish.leadershipdevotional.repository.ILeadershipDevotionalRepository
import com.polish.leadershipdevotional.repository.LeadershipDevotionalRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class LeadershipDevotionalViewModel @Inject constructor(
    private val repository:ILeadershipDevotionalRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    val TAG = "LEAD_DEVOTIONAL_VIEWMODEL"

    /**
     * this is a livedata boolean data instance
     */
    var _isDBEmpty:MutableLiveData<Boolean> = MutableLiveData()
    val isDBEmpty:LiveData<Boolean>
        get() = _isDBEmpty

    /**
     * observe the data from the repository
     */
    val allLeadershipDevotional:LiveData<List<LeadershipDevotionalEntity>> = repository.getAllLeadershipDevotional().asLiveData()


    /**
     * get all the list of Leadership devotional
     */
    fun getAllLeadershipDevtional() {
        val check =  repository.getAllLeadershipDevotional()
    }

    fun insertLeadershipDevotional(leadershipDevotion:LeadershipDevotionalEntity) {
        viewModelScope.launch {
            repository.insert(leadershipDevotion)
        }
    }

    fun CheckDBContent():Boolean{
       val result= repository.checkDBContentNow()
        return (result.value == null)
    }

}