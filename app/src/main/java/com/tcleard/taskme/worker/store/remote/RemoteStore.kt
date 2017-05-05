package com.tcleard.taskme.worker.store.remote

import com.tcleard.taskme.worker.store.Store

/**
 * Created by geckoz on 05/05/2017.
 */
abstract class RemoteStore : Store() {

    lateinit var authModule : RemoteAuthModule
}