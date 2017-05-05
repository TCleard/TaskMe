package com.tcleard.taskme.worker.store.locale

import com.tcleard.taskme.model.Token

/**
 * Created by geckoz on 05/05/2017.
 */
interface LocaleTokenModule {

    fun setToken(token: Token?)

    fun getToken(): Token?

}