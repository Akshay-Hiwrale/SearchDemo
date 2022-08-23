package com.akandro.searchdemoapp.ui.search.domain

import com.akandro.searchdemoapp.model.Search

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
interface SearchUseCase {
    fun getMergedSearchItems(query:String):List<Search>
}