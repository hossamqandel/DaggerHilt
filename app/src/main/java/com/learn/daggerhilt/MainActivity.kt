package com.learn.daggerhilt

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.learn.daggerhilt.Model.Human
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var human: Human

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "onCreate: ", )
        Log.e(TAG, "onCreate222222222222: ", )
        Log.e(TAG, "Javaaaaaaaaaaaaaaaaaaaaaaa: ", )


        Toast.makeText(baseContext, human.getEat(), Toast.LENGTH_LONG).show()
    }
}