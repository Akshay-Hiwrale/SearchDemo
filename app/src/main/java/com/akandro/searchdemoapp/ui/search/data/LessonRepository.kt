package com.akandro.searchdemoapp.ui.search.data

import com.akandro.searchdemoapp.model.Lesson

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
class LessonRepository(val lessonLocalSource: LessonLocalSource) : LessonRepositoryApi {

    override fun getSearchItems(query: String): List<Lesson> {
      return lessonLocalSource.getLessonItemsFromDb(query)
    }
}