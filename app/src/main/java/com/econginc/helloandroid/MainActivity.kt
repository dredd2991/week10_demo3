//The is the Kotlin file and is the MainActivity
package com.econginc.helloandroid

import android.app.Activity
import android.os.Bundle
//This is the first activity loaded by my app MainActivity
class MainActivity : Activity() {

//This is the first function that is run by any activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
