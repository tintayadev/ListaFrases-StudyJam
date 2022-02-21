package com.example.listafrases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listafrases.adapters.FraseAdapter
import com.example.listafrases.dataSources.DataSource
import com.example.listafrases.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataSource = DataSource()
        binding.lista.adapter = FraseAdapter(dataSource.cargarFrases())



    }
}