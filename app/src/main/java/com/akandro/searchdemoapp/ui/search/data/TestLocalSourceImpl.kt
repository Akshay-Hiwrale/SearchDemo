package com.akandro.searchdemoapp.ui.search.data

import com.akandro.searchdemoapp.database.TestDao
import com.akandro.searchdemoapp.model.Test

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
class TestLocalSourceImpl(private val testDao: TestDao): TestLocalSource {

    override fun getTestItemsFromDb(query: String): List<Test> {
      return  testDao.(query)
    }
}