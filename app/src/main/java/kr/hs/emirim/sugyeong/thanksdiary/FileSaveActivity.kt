package kr.hs.emirim.sugyeong.thanksdiary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.write_activity.*

class FileSaveActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.write_activity)

        saveButton.setOnClickListener {
            val filename = Title.text.toString()
            val text = textfield.text.toString()
            when {
                TextUtils.isEmpty(filename) -> {
                    Toast.makeText(applicationContext, "제목이 비어있습니다", Toast.LENGTH_LONG).show()
                }
                else -> {
                    saveToInnerStorage(text, filename)
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }//oncreate끝
    private fun saveToInnerStorage(text: String, filename: String) {
        val fileOutputStream = openFileOutput(filename, Context.MODE_PRIVATE)

        fileOutputStream.write(text.toByteArray())

        fileOutputStream.close()
    }
}