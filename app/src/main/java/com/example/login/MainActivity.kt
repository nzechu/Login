package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding :ActivityMainBinding? = null
    var adapter:FactAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }
    private fun setUpFact(){
        adapter = FactAdapter(this, DummyData.funFacts)
        binding?.factListView?.adapter = adapter

    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }



}