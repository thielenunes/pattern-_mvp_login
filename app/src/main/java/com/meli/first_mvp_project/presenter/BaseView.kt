package com.meli.first_mvp_project.presenter

interface BaseView <T> {

    var presenter : T
    fun bindView()

}