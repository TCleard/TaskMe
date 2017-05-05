package com.tcleard.taskme.worker.store.remote

import com.tcleard.taskme.model.Token

/**
 * Created by geckoz on 05/05/2017.
 */
interface RemoteAuthModule {

    fun login(email : String, password: String, callback : RemoteCallback<Token>)

}