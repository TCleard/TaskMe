package com.tcleard.taskme.contract

/**
 * Created by geckoz on 05/05/2017.
 */
abstract class BaseInteractor<P : BasePresenter<*>> {

    lateinit var output: P

}