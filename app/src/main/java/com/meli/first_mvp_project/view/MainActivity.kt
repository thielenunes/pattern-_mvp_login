package com.meli.first_mvp_project.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.meli.first_mvp_project.R
import com.meli.first_mvp_project.presenter.LoginContract
import com.meli.first_mvp_project.presenter.LoginPresenter

class MainActivity : AppCompatActivity(), LoginContract.View {

    override lateinit var presenter: LoginPresenter

    lateinit var loginInput : EditText
    lateinit var passwordInput : EditText
    lateinit var btnLogin : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = LoginPresenter(this)
        presenter.start()

        btnLogin.setOnClickListener {
            presenter.isLoginValid(loginInput.text.toString(),
                passwordInput.text.toString())
        }
    }

    override fun showError() {
        Toast.makeText(this,"No es Thiele", Toast.LENGTH_LONG).show()
    }

    override fun startHomeActivity() {
        var intent =  Intent(this, HomeActivity :: class.java)
        startActivity(intent)
    }

    override fun bindView() {
        loginInput = findViewById(R.id.txtUser)
        passwordInput = findViewById(R.id.txtPass)
        btnLogin = findViewById(R.id.btnLogin)

    }
}