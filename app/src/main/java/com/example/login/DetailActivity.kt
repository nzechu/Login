package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.login.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    var binding :ActivityDetailBinding? = null
    private var logo = 0
    private var name:String? = null
    private var detail:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs,0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAs)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAs)
        setUpFactDetail()

    }

    private fun setUpFactDetail() {
        binding?.detailTv?.text  = detail
        binding?.logoIv?.setImageResource(logo)
        title = name
    }


}