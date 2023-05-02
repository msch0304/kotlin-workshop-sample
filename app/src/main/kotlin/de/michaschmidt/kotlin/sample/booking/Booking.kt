package de.michaschmidt.kotlin.sample.booking


data class Booking (val id: Int, val amount:Double, val category: BookingCategory){
    override fun equals(other: Any?): Boolean {
        return other is Booking && this.id == other.id && this.amount == other.amount
                && this.category == other.category
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "$id $amount ${category.toString()}"
    }
}

