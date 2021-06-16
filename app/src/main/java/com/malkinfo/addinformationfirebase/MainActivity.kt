package com.malkinfo.addinformationfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malkinfo.addinformationfirebase.view.ItemsActivity
import com.malkinfo.addinformationfirebase.view.UploadActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnViewAll.setOnClickListener {
            startActivity(Intent(this,ItemsActivity::class.java))
        }
        btnAddInfo.setOnClickListener {
            startActivity(Intent(this,UploadActivity::class.java))
        }

    }
   

}