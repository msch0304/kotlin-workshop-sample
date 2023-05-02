package de.michaschmidt.kotlin.sample.math

import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun productInt() {
        val calc = Calculator()
        val result = calc.product(2, 6)
        assertEquals(12, result)
    }

    @Test
    fun productDouble() {
        val calc = Calculator()
        val result = calc.product(3.5, 2.0)
        assertEquals(7.0, result)
    }
    @Test
    fun exponantianteInt() {
        val calc = Calculator()
        val result = calc.exponantiante(2,2)
        assertEquals(4, result)
    }

    @Test
    fun exponantianteDouble() {
        val calc = Calculator()
        val result = calc.exponantiante(4.0,0.5)
        assertEquals(2.0, result)
    }

    @Test
    fun averageInt() {
        val liste = listOf(2,3,4,1,0,3,4,5)
        val calc = Calculator()
        val result = calc.average(liste)
        assertEquals(2, result)
    }

    @Test
    fun averageDouble() {
        val liste = listOf(2.0,3.0,4.0,1.0,0.0,3.0,4.0,3.0)
        val calc = Calculator()
        val result = calc.average(liste)
        assertEquals(2.5, result)
    }

    @Test
    fun absoluteInt(){
        val calc = Calculator()
        val result = calc.absolute(-3)
        assertEquals(3, result)
    }

    @Test
    fun absoluteDouble(){
        val calc = Calculator()
        val result = calc.absolute(-2.5)
        assertEquals(2.5, result)
    }

    @Test
    fun squareInt(){
        val calc = Calculator()
        val result = calc.square(-3)
        assertEquals(9, result)
    }

    @Test
    fun squareDouble(){
        val calc = Calculator()
        val result = calc.square(1.5)
        assertEquals(2.25, result)
    }
}