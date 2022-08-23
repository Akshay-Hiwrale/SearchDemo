package com.akandro.searchdemoapp.database

import com.akandro.searchdemoapp.model.Search

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
interface SearchDao {
//search query to get combined data from two table
fun getSearchListByQuery(searchQuery: String):List<Search>
}