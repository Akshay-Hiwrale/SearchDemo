package com.akandro.searchdemoapp.database

import com.akandro.searchdemoapp.model.Test

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
interface TestDao {
    // get result using like query
    @Query("SELECT * FROM test WHERE title LIKE '%'||:searchQuery||'%')
        fun getTestListByQuery(searchQuery: String): List<Test>
}
