package com.akandro.searchdemoapp.ui.search.domain

import com.akandro.searchdemoapp.model.Search
import com.akandro.searchdemoapp.ui.search.data.LessonRepositoryApi
import com.akandro.searchdemoapp.ui.search.data.TestRepositoryApi
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
class SearchUseCaseImpl(
    private val testRepository: TestRepositoryApi,
    private val lessonRepository: LessonRepositoryApi
) : SearchUseCase {
    //it will return the merged and sorted list
    override fun getMergedSearchItems(query: String): List<Search> {
        val lessonSearch: List<Search> = lessonRepository.getSearchItems(query).map { lesson ->
            Search(lesson.id, lesson.type, lesson.title, returnPriority(lesson.title, query))
        }
        val testSearch: List<Search> = testRepository.getSearchItems(query).map { test ->
            Search(test.id, "test", test.title, returnPriority(test.title, query))
        }
        return (lessonSearch + testSearch)
    }

    private fun returnPriority(str: String, query: String): Int {
        val pattern: Pattern = Pattern.compile(query)
        val matcher: Matcher = pattern.matcher(str)
        val startIndex = matcher.start()
        var priority = 0
        if (str == query)
            priority += 999
        if (startIndex == 0 && str[startIndex + query.length + 1] == ' ')
            priority += 1
        if(startIndex>0)
            priority += (str.length - startIndex)

        return priority
    }
}