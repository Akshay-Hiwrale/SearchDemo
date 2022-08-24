package com.akandro.searchdemoapp.data

import com.akandro.searchdemoapp.model.Lesson

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
interface LessonLocalSource {
    fun getLessonItemsFromDb(query:String): List<Lesson>
}