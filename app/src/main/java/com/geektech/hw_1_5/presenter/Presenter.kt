package com.geektech.hw_1_5.presenter

import android.graphics.Color
import com.geektech.hw_1_5.injector.Injector
import com.geektech.hw_1_5.view.CounterView

class Presenter {

    var model = Injector.fillModel()
    lateinit var view: CounterView

    fun incrementCount() {
        model.increment()
        view.updateText(model.count.toString())
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count == 15) {
            view.changeColor(Color.GREEN)
        }
    }

    fun decrementCount() {
        model.decrement()
        view.updateText(model.count.toString())
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count < 15) {
            view.changeColor(Color.BLACK)
        }
    }

    fun attachView(view: CounterView) {
        this.view = view
    }
}