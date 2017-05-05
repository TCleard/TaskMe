package com.tcleard.taskme.worker.store.locale

import com.tcleard.taskme.worker.store.Store

/**
 * Created by geckoz on 05/05/2017.
 */
abstract class LocaleStore : Store() {

    lateinit var tokenModule: LocaleTokenModule

}