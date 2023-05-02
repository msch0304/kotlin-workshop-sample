package de.michaschmidt.kotlin.sample.math


class Calculator {

    fun product(a: Int, b: Int): Int {
        return a * b
    }

    fun product(a: Double, b: Double): Double {
        return a * b
    }

    fun exponantiante (a: Int, b: Int) : Int {
        val r = Math.pow(a.toDouble(), b.toDouble()).toInt()
        return r
    }
    fun exponantiante (a: Double, b: Double) : Double {
        return Math.pow(a, b)
    }
    fun absolute(a: Int) : Int {
        return Math.abs(a)
    }

    fun absolute(a: Double) : Double {
        return Math.abs(a)
    }

    fun average(list: List<Int>) : Int {
        return list.average().toInt()
    }
    fun average(list: List<Double>) : Double {
        return list.average()
    }
    fun square(a: Int) : Int {
        return a * a
    }

    fun square(a: Double) : Double {
        return a * a
    }
}