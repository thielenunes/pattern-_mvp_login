package com.meli.first_mvp_project.presenter

interface LoginContract {

    interface View : BaseView<LoginPresenter>{
        fun showError()
        fun startHomeActivity()
    }

    interface Presenter : BasePresenterInterface {
        fun isLoginValid(user : String, password : String)
    }

}