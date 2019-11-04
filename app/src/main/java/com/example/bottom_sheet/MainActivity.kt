package com.example.bottom_sheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottomsheet.*

class MainActivity : AppCompatActivity() {
//add dependency     implementation 'com.android.support:design:28.0.0'/27.0.0
    //make bottom sheet separate layout file
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottomsheet,null)
            //must write line 23 other wise onclick listener not work and error ocoured
            val icon = view.findViewById<ImageView>(R.id.close)
            icon.setOnClickListener {
                dialog.dismiss()
            }
            dialog.setCancelable(false)
            dialog.setContentView(view)
            dialog.show()

        }
    }

}
