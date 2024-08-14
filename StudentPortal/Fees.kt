package StudentPortal

interface Type{
    fun studentFees() : Float
}

class Dayscholar(val transport:String,val distance:Float,val busType:String) : Type {
    override fun studentFees(): Float {
        return when(transport)
        {
            "COLLEGEBUS" -> {
                when(busType){
                    "AC" -> distance*10+5000
                    "NONAC" -> distance*10
                    else -> 0f
                }}
            "PRIVATE" -> 0f
            else -> 0f
        }
    }
}

class Hosteller(val roomType:String,val bedType:Int,val messType:String) : Type {
    override fun studentFees(): Float {
        return roomFee() + messFee()
    }
    fun messFee():Float{
        return when(messType){
            "VEG" -> 35000.00f
            "NONVEG" -> 55000.00f
            "SPECIAL" -> 70000.00f
            else -> 0.00f
        }
    }
    fun roomFee():Float{
        return when(roomType){
            "AC"-> when(bedType){
                1 -> 90000.00f
                2 -> 75000.00f
                3 -> 60000.00f
                4 -> 50000.00f
                6 -> 40000.00f
                else -> 0.00f
            }

            "NONAC"-> when(bedType){
                1 -> 60000.00f
                2 -> 50000.00f
                3 -> 40000.00f
                4 -> 30000.00f
                6 -> 20000.00f
                else -> 0.00f
            }

            else->{
                println("Specified Type is not available")
                0.0f
            }
        }
    }
}

class Academics(private val studentRank:Int) : Type {
    override fun studentFees():Float {
        return when(studentRank){
            in 1..40000 -> 96000f
            in 40001..80000 -> 150000f
            in 80001..100000 -> 200000f
            else -> 250000f
        }
    }
}