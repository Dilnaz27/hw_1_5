package com.geektech.hw_1_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.geektech.hw_1_5.databinding.ActivityMainBinding
import com.geektech.hw_1_5.view.CounterView
import com.geektech.hw_1_5.injector.Injector

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
    var presenter = Injector.fillPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.incrementCount()
            }

            decrementBtn.setOnClickListener {
                presenter.decrementCount()
            }
        }
    }

    override fun updateText(count: String) {
        binding.resultTv.text = count
    }

    override fun changeColor(color: Int) {
        binding.resultTv.setTextColor(color)
    }

    override fun showToast() {
        Toast.makeText(this,"Вау", Toast.LENGTH_SHORT).show()
    }
}