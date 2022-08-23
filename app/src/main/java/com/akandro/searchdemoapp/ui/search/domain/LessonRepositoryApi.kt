package com.akandro.searchdemoapp.ui.search.domain

import com.akandro.searchdemoapp.model.Lesson
import com.akandro.searchdemoapp.model.Search
import com.akandro.searchdemoapp.model.Test

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
interface LessonRepositoryApi {
    fun getSearchItems(query:String):List<Lesson>
}