package com.example.login

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        loadFragment(FragmentObat())
        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
        bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.menu_obat -> {
                    loadFragment(FragmentObat())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_riwayat -> {
                    loadFragment(FragmentRiwayat())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_exit -> {
                    val intent = Intent(this, MainActivity::class.java)
                    val mBundle = Bundle()
                    mBundle.putString("username","")
                    mBundle.putString("password","")
                    intent.putExtra("register", mBundle)

                    startActivity(intent)
                }
            }
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(com.google.android.material.R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
//
//        setTitle("Daftar Obat")
//
//        changeFragment(FragmentObat())
//    }
//
//    fun changeFragment(fragment: Fragment?) {
//        if (fragment != null) {
//            getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.layout_fragment, fragment)
//                .commit()
//        }
//    }
//
//    fun BottomNavigationView.OnNavigationItemSelectedListener { item ->
//        when(item.itemId) {
//            R.id.menu_obat -> {
//                // Respond to navigation item 1 click
//                changeFragment(FragmentObat())
//            }
//            R.id.menu_riwayat -> {
//                // Respond to navigation item 2 click
//                changeFragment(FragmentRiwayat())
//            }
//            else -> false
//        }
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//
//        if (item.itemId == R.id.menu_obat) {
//            changeFragment(FragmentObat())
//        }else if(item.itemId == R.id.menu_riwayat) {
//            changeFragment(FragmentRiwayat())
//        }else {
//            val builder: AlertDialog.Builder = AlertDialog.Builder(this@HomeActivity)
//            builder.setMessage("Are you sure want to exit?")
//                .setPositiveButton("YES", object : DialogInterface.OnClickListener {
//                    override fun onClick(dialogInterface: DialogInterface, i: Int) {
//                        finishAndRemoveTask()
//                    }
//                })
//                .show()
//        }
//        return super.onOptionsItemSelected(item)
//    }
}