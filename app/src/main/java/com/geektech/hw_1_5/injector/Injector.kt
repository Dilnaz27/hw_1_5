package com.geektech.hw_1_5.injector

import com.geektech.hw_1_5.model.CounterModel
import com.geektech.hw_1_5.presenter.Presenter

class Injector {
    companion object {
        fun fillModel() = CounterModel()
        fun fillPresenter() = Presenter()
    }
}