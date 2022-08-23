package com.akandro.searchdemoapp.ui.search.data

import com.akandro.searchdemoapp.model.Lesson
import com.akandro.searchdemoapp.model.Search

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
interface LessonLocalSource {
    fun getLessonItemsFromDb(query:String): List<Lesson>
}