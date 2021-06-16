package com.malkinfo.addinformationfirebase.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malkinfo.addinformationfirebase.R
import com.malkinfo.addinformationfirebase.uitel.loadImage
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intss = intent
        var nameT = intss.getStringExtra("NAMET")
        var desT = intss.getStringExtra("DESCRIT")
        var imgT = intss.getStringExtra("IMGURI")

        nameDetailTextView.text = nameT
        descriptionDetailTextView.text = desT
        teacherDetailImageView.loadImage(imgT)


    }
}