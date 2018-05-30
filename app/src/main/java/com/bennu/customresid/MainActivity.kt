package com.bennu.customresid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2.text = getString(R.string.test_java)
        textView2.setTextColor(resources.getColor(R.color.test_java_text))
        textView2.setBackgroundResource(R.drawable.test_bg_java)
        textView2.textSize = resources.getDimension(R.dimen.test_java)
        image2.setImageResource(R.drawable.fith)
        text2.setTextAppearance(this, R.style.TextXml)
    }
}
