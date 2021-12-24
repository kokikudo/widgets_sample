package com.example.widgets_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameButton = findViewById<Button>(R.id.compliateNameButton)
        val inputNameText = findViewById<EditText>(R.id.inputNameTextField)
        val result = findViewById<TextView>(R.id.resultText)

        nameButton.setOnClickListener {
            // 更新される文字列をリソースから取得したいときは、strings.xmlでプレースホルダーを定義し、
            // getString(ResID, 代入する文字列)で呼び出す
            result.text = getString(R.string.greet, inputNameText.text)

            // 警告が出る書き方　→　result.text = "こんにちは、${inputNameText.text}さん"
        }
    }


}