package com.example.screendimens

import android.graphics.Point
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declare the button from the layout file
        val btn = findViewById<Button>(R.id.btn)

        // Action when the button is clicked
        btn.setOnClickListener {

            // get default display from the windows manager
            val display = windowManager.defaultDisplay

            // declare and initialize a point
            val size = Point()

            // store the points related details from the display variable in the size variable
            display.getSize(size)

            // store the point information in integer variables width and height
            // where .x extracts width pixels and .y extracts height pixels
            val width = size.x
            val height = size.y

            // Toast will display the width and height values
            Toast.makeText(applicationContext,"Width: $width Pixels , Height: $height Pixels",Toast.LENGTH_LONG).show()

        }
    }
}