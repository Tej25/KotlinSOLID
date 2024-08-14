package StudentPortal

interface Type {
    fun studentFees(): Float
}

class Dayscholar(private val transport: Transport) : Type {
    override fun studentFees(): Float {
        return transport.calculateFee()
    }
}

interface Transport {
    fun calculateFee(): Float
}

class CollegeBus(private val distance: Float, private val busType: BusType) : Transport {
    override fun calculateFee(): Float {
        return when (busType) {
            BusType.AC -> distance * 10 + 5000
            BusType.NONAC -> distance * 10
        }
    }
}

class PrivateTransport : Transport {
    override fun calculateFee(): Float = 0f
}

enum class BusType {
    AC, NONAC
}

class Hosteller(private val room: Room, private val mess: Mess) : Type {
    override fun studentFees(): Float {
        return room.fee + mess.fee
    }
}

class Room(val type: RoomType, val bedType: Int) {
    val fee: Float
        get() = when (type) {
            RoomType.AC -> when (bedType) {
                1 -> 90000.00f
                2 -> 75000.00f
                3 -> 60000.00f
                4 -> 50000.00f
                6 -> 40000.00f
                else -> 0.00f
            }
            RoomType.NONAC -> when (bedType) {
                1 -> 60000.00f
                2 -> 50000.00f
                3 -> 40000.00f
                4 -> 30000.00f
                6 -> 20000.00f
                else -> 0.00f
            }
        }
}

enum class RoomType {
    AC, NONAC
}

class Mess(val type: MessType) {
    val fee: Float
        get() = when (type) {
            MessType.VEG -> 35000.00f
            MessType.NONVEG -> 55000.00f
            MessType.SPECIAL -> 70000.00f
        }
}

enum class MessType {
    VEG, NONVEG, SPECIAL
}

class Academics(private val studentRank: Int) : Type {
    override fun studentFees(): Float {
        return when (studentRank) {
            in 1..40000 -> 96000f
            in 40001..80000 -> 150000f
            in 80001..100000 -> 200000f
            else -> 250000f
        }
    }
}
