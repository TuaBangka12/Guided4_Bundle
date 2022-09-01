package com.agung.guided4_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GD4BundleResult : AppCompatActivity() {
    private lateinit var nama: TextView
    private lateinit var npm: TextView
    private lateinit var fakultas: TextView
    private lateinit var prodi: TextView
    lateinit var  mBunlde: Bundle

    lateinit var vNama: String
    lateinit var vNpm: String
    lateinit var vFakultas: String
    lateinit var vProdi : String



        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gd4_bundle_result)
            getBundle()
            setText()

        }

    fun getBundle(){
        //mengambil bundle dari activity sebelumnya dengan menggunakan key register
        mBunlde= intent.getBundleExtra("register")!!
        //mengambil data dari bundle
        vNama = mBunlde.getString("nama")!!
        vNpm = mBunlde.getString("npm")!!
        vFakultas = mBunlde.getString("fakultas")!!
        vProdi = mBunlde.getString("prodi")!!


    }

    fun setText() {
        nama = findViewById(R.id.tvNama)
        nama.setText(vNama)
        npm = findViewById(R.id.tvNpm)
        npm.setText(vNpm)
        fakultas = findViewById(R.id.tvFakultas)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.tvProdi)
        prodi.setText(vProdi)
    }
}