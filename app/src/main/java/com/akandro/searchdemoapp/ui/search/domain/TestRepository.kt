package com.akandro.searchdemoapp.ui.search.domain

import com.akandro.searchdemoapp.model.Test
import com.akandro.searchdemoapp.ui.search.data.TestLocalSource

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
class TestRepository(val testLocalSource: TestLocalSource) : TestRepositoryApi {

    override fun getSearchItems(query: String): List<Test> {
      return testLocalSource.getTestItemsFromDb(query)
    }
}