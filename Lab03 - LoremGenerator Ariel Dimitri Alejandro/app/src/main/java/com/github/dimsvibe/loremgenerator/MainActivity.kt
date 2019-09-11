package com.github.dimsvibe.loremgenerator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.creator_button).setOnClickListener(it: View!)
            pickCreatorName(it)
    }

    private fun pickCreatorName(view: View) {
        val creatorFill = findViewById<EditText>(R.id.creator_fill)
        val (creatorText = findViewById<TextView>(R.id.creator_text)

        creatorText.text = creatorFill.creator_text
        creatorFill.visibility = View.GONE
        view.visibility = View.GONE
        creatorText.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, flags: 0)
    }

    private fun changeCreatorName(view: View)
    {
        val creatorFill = findViewById<EditText>(R.id.creator_fill)
        val creatorButton = findViewById<Button>(R.id.creator_button)

        view.visibility = View.GONE
        creatorFill.visibility = view.VISIBLE
        creatorButton.visibility = view.VISIBLE

        creatorFill.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(creatorFill, flags: 0)
    }
}
