package com.meli.first_mvp_project.presenter

import com.meli.first_mvp_project.model.LoginAuth


class LoginPresenter (val view : LoginContract.View) : LoginContract.Presenter {

    override fun start() {
        view.bindView()
    }

    override fun isLoginValid(user: String, password: String) {
        if(user.isEmpty() || password.isEmpty()){
            view.showError()
        }else{
            if(password == LoginAuth.PASSWORD && user == LoginAuth.USERNAME){
                view.startHomeActivity()
            }else{
                view.showError()
            }
        }
    }
}