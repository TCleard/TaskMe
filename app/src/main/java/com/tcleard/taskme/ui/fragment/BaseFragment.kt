package com.tcleard.taskme.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

/**
 * Created by geckoz on 05/05/2017.
 */
abstract class BaseFragment : Fragment() {

    private var shouldRestore = false

    init {

        if (arguments == null) {
            arguments = Bundle()
        }

    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (shouldRestore) {
            onRestore()
        } else {
            onFirstCreation()
        }

    }

    override fun onDestroyView() {

        shouldRestore = true
        onSave()

        super.onDestroyView()

    }

    abstract fun onFirstCreation()
    abstract fun onSave()
    abstract fun onRestore()

}