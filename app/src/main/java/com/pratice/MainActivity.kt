package com.pratice

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class ABuild(context: Context, var name: String, var sex: Int = 0) {
    init {
        var sexName = if (sex == 0) "公" else "母"
        context.toast("this $name is $sexName")
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var a = 0
            when (a++ % 2) {
                0 -> {
                    var animal = ABuild(this, "hhh")
                    textView.text="${animal.name}"
                }
                else ->{
                    var animal =ABuild(this,"cxk",2)
                    textView.text="${animal.name}"
                }
            }


        }

    }

}
