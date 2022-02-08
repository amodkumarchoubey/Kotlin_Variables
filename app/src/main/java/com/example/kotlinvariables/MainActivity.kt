package com.example.kotlinvariables

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view_id) as TextView
        var score=5
        // we can reasign value of var
        score=10
        val message="Amod"
        //here we cannot reassign value in val typpe
//        message="other data assign";
        Log.e("Val value is :","-->"+message)
        Log.e("score value is :","-->"+score)
        Toast.makeText(applicationContext,message,Toast.LENGTH_LONG).show()


//        Explicit value define in kotlin

        var score_:Int=5;

        var score_double:Double=99.1

        var israining:Boolean=true;

        var message_:String="Amod Explicit"


        Log.e(" Explicit score_  is :","-->"+score_)

        Log.e("Explicit score_double is:","-->"+score_double)

        Log.e(" Explicit israining  is :","-->"+israining)

        Log.e(" Explicit message_  is :","-->"+message_)
        Toast.makeText(applicationContext,message_,Toast.LENGTH_LONG).show()

        textView.setText(message+"\n"+"\n"+score+"\n"+"\n"+score_+"\n"+"\n"+score_double+"\n"+"\n"+israining+"\n"+"\n"+message_)



    }
}