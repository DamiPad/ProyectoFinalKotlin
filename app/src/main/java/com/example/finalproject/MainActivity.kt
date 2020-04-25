package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.finalproject.API.BeerMainActivity
import com.example.finalproject.Helper.doAsync
import kotlinx.android.synthetic.main.activity_main.*

import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btnIniciarSesion.setOnClickListener {
           //Toast.makeText(this,"Se intento iniciar sesion", Toast.LENGTH_LONG).show()
            val intent2 = Intent(this, MenuActivity::class.java)
            startActivity(intent2)


        }




    }



}



