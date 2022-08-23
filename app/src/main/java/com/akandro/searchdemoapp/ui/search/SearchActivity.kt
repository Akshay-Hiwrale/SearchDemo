package com.akandro.searchdemoapp.ui.search

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.akandro.searchdemoapp.R
import com.akandro.searchdemoapp.model.Search
import com.akandro.searchdemoapp.ui.search.viewmodel.SearchViewModel
import com.akandro.searchdemoapp.utils.ErrorState
import com.akandro.searchdemoapp.utils.LoadingState
import com.akandro.searchdemoapp.utils.SuccessState
import com.akandro.searchdemoapp.utils.VMState

/**
 * Created by Akshay Hiwrale on 02/08/22.
 * akshay.h@dailyrounds.org
 */
class SearchActivity : AppCompatActivity() {

    private val searchViewModel:SearchViewModel = SearchViewModel()
    private var btSearch:ImageView? = null
    private var etSearch:EditText? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_search)
        init()
        initListener()
        initObserver()
    }
    private fun init(){
        btSearch = findViewById(R.id.btSearch)
        etSearch = findViewById(R.id.etSearch)
    }

    private fun initListener() {
        btSearch?.setOnClickListener {
            searchViewModel.getSearchResultByQuery(etSearch?.text.toString())
        }
    }

    private fun initObserver() {
        searchViewModel.searchResponse.observe(
            this
        ) { response ->
            processSearchResponse(response)
        }
    }

    //Based on Response State we can handle the state here
    private fun processSearchResponse(response: VMState<Search>) {
        when (response) {
             is LoadingState -> {
                    //show loading
             }
             is SuccessState -> {
                    //update recycler view
             }
             is ErrorState -> {
                 //show error
             }
             }
    }


}