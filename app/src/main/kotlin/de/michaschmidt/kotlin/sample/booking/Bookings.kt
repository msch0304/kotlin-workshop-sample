package de.michaschmidt.kotlin.sample.booking

class Bookings(val bookingList: MutableList<Booking>){



    fun addBooking(booking: Booking) {
        bookingList.add(booking)
    }

    fun totalSum(): Double = bookingList.sumOf { it.amount }

    fun countOfBookings(): Int = bookingList.count()

    fun averageAmount(): Double = bookingList.map { it.amount }.average()

    fun sumPerCategory(): Map<BookingCategory, Double> {
        val groupMap = bookingList.groupBy { it.category }.mapValues { it.value.sumOf { it.amount } }
        return groupMap
    }

    fun countPerCategory(): Map<BookingCategory, Int> = bookingList.groupBy { it.category }.mapValues { it.value.count() }

    fun printOut() {
        println("Total revenue: ${this.totalSum()}")
        println("Number of bookings: ${this.countOfBookings()}")
        println("Average revenue per booking: ${this.averageAmount()}")
        println("Number of bookings per category: ${this.countPerCategory()}")
        println("Revenue per category: ${this.sumPerCategory()}")
    }
}