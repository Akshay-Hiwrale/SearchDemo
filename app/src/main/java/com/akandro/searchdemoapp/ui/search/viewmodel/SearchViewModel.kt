package com.akandro.searchdemoapp.ui.search.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.akandro.searchdemoapp.model.Search
import com.akandro.searchdemoapp.domain.SearchUseCase
import com.akandro.searchdemoapp.utils.*

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
class SearchViewModel(private val searchUseCase: SearchUseCase): ViewModel() {
    val searchResponse = MutableLiveData<VMState<Search>>()

    //this fun will send the final sorted data either its success data or error data state
    fun getSearchResultByQuery(searchQuery: String) {
        searchResponse.postLoading()
        searchUseCase.getMergedSearchItems(searchQuery).sortedByDescending {
            it.priority
        }.executeIo({
                searchResponse.postSuccess(it)
            }, { e ->
                searchResponse.postError(e)
            })
    }
}