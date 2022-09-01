package com.agung.guided4_bundle

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nama: TextInputEditText
    private lateinit var npm: TextInputEditText
    private lateinit var fakultas: TextInputEditText
    private lateinit var prodi: TextInputEditText
    private lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama = findViewById(R.id.insNama)
        npm = findViewById(R.id.insNPM)
        fakultas = findViewById(R.id.insFakultas)
        prodi = findViewById(R.id.insProdi)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val intent = Intent(this, GD4BundleResult::class.java)
            val mBundle = Bundle()
            //memasukkan data ke dalam bundle
            mBundle.putString("nama ", nama.text.toString())
            mBundle.putString("nim ", npm.text.toString())
            mBundle.putString("fakultas ", fakultas.text.toString())
            mBundle.putString("prodi ", prodi.text.toString())
            //melakukan intent dengan memanggil bundle
            intent.putExtra("register", mBundle)

            startActivity(intent)

        }

    }
}