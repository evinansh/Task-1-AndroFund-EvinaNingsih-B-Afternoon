package com.example.tugasfundamental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.tugasfundamental.R.id.edt_password

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var etConfirmPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUsername = findViewById(R.id.edt_username)
        etPassword = findViewById(R.id.edt_password)
        etConfirmPassword = findViewById(R.id.edt_confirm_password)

        val btnRegister: Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.btn_register -> {

                val bundle = Bundle()
                bundle.putString("username", etUsername.text.toString())
                bundle.putString("username", etPassword.text.toString())

                val intent = Intent(this@RegisterActivity, LoginActivity:: class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}