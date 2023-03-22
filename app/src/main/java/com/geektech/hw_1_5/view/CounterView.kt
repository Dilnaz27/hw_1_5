package com.geektech.hw_1_5.view

interface CounterView {
    fun updateText(count: String)
    fun changeColor(color: Int)
    fun showToast()
}