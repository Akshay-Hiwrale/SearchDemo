package com.akandro.searchdemoapp.ui.search.data

import com.akandro.searchdemoapp.database.LessonDao
import com.akandro.searchdemoapp.model.Lesson
import com.akandro.searchdemoapp.ui.search.data.LessonLocalSource

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
class LessonLocalSourceImpl(private val lessonDao: LessonDao): LessonLocalSource {

    override fun getLessonItemsFromDb(query: String): List<Lesson> {
      return  lessonDao.getLessonListByQuery(query)
    }
}