package com.tcleard.taskme.worker.store.remote

/**
 * Created by geckoz on 05/05/2017.
 */
interface RemoteCallback<T> {

    fun onResponse(result: T, errorRes: Int)

}