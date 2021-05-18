package com.example.pokemontest.ui.msr

import android.net.http.SslError
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import android.widget.ProgressBar
import androidx.databinding.DataBindingUtil
import com.example.pokemontest.R
import com.example.pokemontest.databinding.FragmentMsrDevBinding


class MsrDevFragment : Fragment() {

    var pageUrl: String = "https://www.google.com"
    val MAX_PROGRESS = 100
    private lateinit var binding: FragmentMsrDevBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_msr_dev, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initWebView()
        setWebClient()
        loadUrl(pageUrl)
    }

    private fun initWebView() {
        binding.webView.settings.javaScriptEnabled = true
        binding.webView.settings.loadWithOverviewMode = true
        binding.webView.settings.useWideViewPort = true
        binding.webView.settings.domStorageEnabled = true
        binding.webView.settings.databaseEnabled = true
        binding.webView.settings.setAppCacheEnabled(true)
        binding.webView.webViewClient = object : WebViewClient() {
            override
            fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler?.proceed()
            }
        }

    }
    private fun setWebClient() {
        binding.webView.webChromeClient = object : WebChromeClient() {
            override fun onGeolocationPermissionsShowPrompt(
                origin: String?,
                callback: GeolocationPermissions.Callback?
            ) {



            }

            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                binding.progressBar.progress = newProgress
                if (newProgress < MAX_PROGRESS && binding.progressBar.visibility == ProgressBar.GONE) {
                    binding.progressBar.visibility = ProgressBar.VISIBLE
                }
                if (newProgress == MAX_PROGRESS) {
                    binding.progressBar.visibility = ProgressBar.GONE
                }
            }


        }
    }

    private fun loadUrl(pageUrl: String) {
       binding.webView.loadUrl(pageUrl)
    }



}