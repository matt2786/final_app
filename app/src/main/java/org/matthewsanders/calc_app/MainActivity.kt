package org.matthewsanders.calc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun backTapped (view: View){

        login.alpha = 1.0f
    }

    fun detailsTapped (view: View){

        summary.alpha = 1.0f

    }

    fun calcTapped (view: View) {

        calculator.alpha = 1.0f

    }
}
