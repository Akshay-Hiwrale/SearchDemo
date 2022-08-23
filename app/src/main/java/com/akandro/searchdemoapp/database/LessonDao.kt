package com.akandro.searchdemoapp.database

import com.akandro.searchdemoapp.model.Lesson
import com.akandro.searchdemoapp.model.Search

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
interface LessonDao {
    // get result using like query
    @Query("SELECT * FROM test WHERE title LIKE '%'||:searchQuery||'%')
        fun getLessonListByQuery(searchQuery: String):List<Lesson>
}