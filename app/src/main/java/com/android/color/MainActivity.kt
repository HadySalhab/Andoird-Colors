package com.android.color

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = listOf<View>(findViewById(R.id.textView_box1),
            findViewById(R.id.textView_box2),
            findViewById(R.id.textView_box3),
            findViewById(R.id.textView_box4),
            findViewById(R.id.textView_box5),
            findViewById(R.id.constraint),
            findViewById(R.id.button_red),
            findViewById(R.id.button_green),
            findViewById(R.id.button_yellow))

        listView.forEach {view->
            view.setOnClickListener {
                view->
                changeColor(view)
            }
        }


    }
    fun changeColor(view: View){
        when(view.id){
            //using android color
            R.id.constraint->view.setBackgroundResource(android.R.color.darker_gray)
            R.id.textView_box4->view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.textView_box5->view.setBackgroundResource(android.R.color.holo_orange_dark)



            //using color from Color class
            R.id.textView_box1->view.setBackgroundColor(Color.BLUE)
            R.id.textView_box2->view.setBackgroundColor(Color.CYAN)
            R.id.textView_box3->view.setBackgroundColor(Color.MAGENTA)

            //using custom colors
            R.id.button_red->view.setBackgroundResource(R.color.my_red)
            R.id.button_green->view.setBackgroundResource(R.color.my_green)
            R.id.button_yellow->view.setBackgroundResource(R.color.my_yellow)


        }
    }
}
