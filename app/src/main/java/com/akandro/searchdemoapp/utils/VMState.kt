package com.akandro.searchdemoapp.utils

import androidx.lifecycle.MutableLiveData




fun <T> MutableLiveData<VMState<T>>.postSuccess(data: T): Unit {
    postValue(SuccessState(data))
}

fun <T> MutableLiveData<VMState<T>>.postError(error: Throwable, data: T? = null): Unit {
    postValue(ErrorState(error, data))
}

fun <T> MutableLiveData<VMState<T>>.postLoading(data: T? = null): Unit {
    postValue(LoadingState(data))
}

fun <T> Any.executeIo(
    success: (T) -> Unit,
    failure: (Throwable) -> Unit
): Any {
    return Any()

}




sealed class VMState<V> {
}

data class LoadingState<V>(
    val data: V? = null
) : VMState<V>()

data class SuccessState<V>(
    val data: V
) : VMState<V>()

data class ErrorState<V>(
    val error: Throwable,
    val data: V? = null
) : VMState<V>()
