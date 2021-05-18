package com.example.pokemontest.base

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.pokemontest.R
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

open class BaseFragment:Fragment() {
    private var mProgressDialog: Dialog? = null
    private var mContent: View? = null// For showing snackbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mContent = view
    }

    private fun showProgress() {
        if (mProgressDialog == null) {
            mProgressDialog = Dialog(requireActivity())
            mProgressDialog?.window!!.requestFeature(Window.FEATURE_NO_TITLE)
            mProgressDialog?.setContentView(R.layout.loader_half_layout)
            mProgressDialog?.setCancelable(false)
        }
        mProgressDialog?.show()
    }

    fun showSnackBar(message: String) {
        mContent?.let {
            val snackbar = Snackbar.make(it, message, Snackbar.LENGTH_LONG)
            val snackbarView = snackbar.view
            val tv = snackbarView.findViewById<TextView>(R.id.snackbar_text)
            tv.maxLines = 3
            snackbar.duration = BaseTransientBottomBar.LENGTH_SHORT
            snackbar.show()
        }
    }


    fun hideProgress() {
        if (mProgressDialog != null && mProgressDialog!!.isShowing) {
            mProgressDialog?.dismiss()
        }
    }


    fun showLoading(show: Boolean?) {
        if (show!!) showProgress() else hideProgress()
    }
}