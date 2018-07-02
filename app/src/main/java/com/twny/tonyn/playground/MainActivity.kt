package com.twny.tonyn.playground

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity(), OnClickListener {

    private val TAG = MainActivity::class.java.canonicalName

    private lateinit var mConstraintLayoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        mConstraintLayoutButton = findViewById(R.id.constraint_layout_button)
        mConstraintLayoutButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val viewId = v.id
        when (viewId) {
            R.id.constraint_layout_button -> onConstraintButtonPressed()
        }
    }

    private fun onConstraintButtonPressed() {
        startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        Log.d(TAG, "Constraint button pressed!")
    }
}
