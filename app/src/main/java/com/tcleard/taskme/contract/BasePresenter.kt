package com.tcleard.taskme.contract

/**
 * Created by geckoz on 05/05/2017.
 */
abstract class BasePresenter<C : BaseController> {

    lateinit var output : C

}