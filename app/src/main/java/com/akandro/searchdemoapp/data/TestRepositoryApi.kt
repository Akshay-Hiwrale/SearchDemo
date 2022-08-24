package com.akandro.searchdemoapp.data

import com.akandro.searchdemoapp.model.Test

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
interface TestRepositoryApi {
    fun getSearchItems(query:String):List<Test>
}