package de.michaschmidt.kotlin.sample.booking

import kotlin.math.roundToInt
import kotlin.test.Test
import kotlin.test.assertEquals
class BookingsTest {
    var listTest = mutableListOf(
            Booking(1, 100.23, BookingCategory.BUS),
            Booking(2, 2300.21, BookingCategory.COMPLETE),
            Booking(3, 2100.34, BookingCategory.FLIGHT),
            Booking(4, 652.00, BookingCategory.HOTEL),
            Booking(5, 80.50, BookingCategory.TRAIN),
            Booking(6, 1010.00, BookingCategory.INDIVIDUAL),
            Booking(7, 2020.10, BookingCategory.SHIP),
            Booking(8, 200.10, BookingCategory.HOTEL),
            Booking(9, 1800.12, BookingCategory.COMPLETE),
            Booking(10, 562.90, BookingCategory.FLIGHT),
            Booking(11, 320.00, BookingCategory.INDIVIDUAL),
            Booking(12, 5600.00, BookingCategory.SHIP),
            Booking(13, 80.50, BookingCategory.HOTEL),
            Booking(14, 3000.99, BookingCategory.COMPLETE),
            Booking(15, 2309.30, BookingCategory.FLIGHT)
    )

    @Test
    fun addBooking() {
        val bookings = Bookings(listTest)
        bookings.addBooking(Booking(16, 100.00, BookingCategory.BUS))
        assertEquals(16, listTest.count())
    }

    @Test
    fun totalSum() {
        val bookings = Bookings(listTest)
        val sum = bookings.totalSum()
        assertEquals(22137 , sum.roundToInt())
    }

    @Test
    fun countOfBookings() {
        val bookings = Bookings(listTest)
        val count = bookings.countOfBookings()
        assertEquals(15 , count)
    }

    @Test
    fun averageAmount() {
        val bookings = Bookings(listTest)
        val av = bookings.averageAmount()
        assertEquals( 1476, av.roundToInt())
    }

    @Test
    fun sumPerCategory() {
        val bookings = Bookings(listTest)
        val sumPerCat = bookings.sumPerCategory()
        assertEquals(80.50, sumPerCat[BookingCategory.TRAIN])
    }

    @Test
    fun countPerCategory() {
        val bookings = Bookings(listTest)
        val countPerCat = bookings.countPerCategory()
        assertEquals(2, countPerCat[BookingCategory.SHIP])
    }
}