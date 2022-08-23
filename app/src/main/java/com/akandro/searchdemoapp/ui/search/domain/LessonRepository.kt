package com.akandro.searchdemoapp.ui.search.domain

import com.akandro.searchdemoapp.model.Lesson
import com.akandro.searchdemoapp.ui.search.data.LessonLocalSource

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
class LessonRepository(val lessonLocalSource: LessonLocalSource) : LessonRepositoryApi {

    override fun getSearchItems(query: String): List<Lesson> {
      return lessonLocalSource.getLessonItemsFromDb(query)
    }
}