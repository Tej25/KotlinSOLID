package StudentPortal

import com.sun.jdi.connect.Transport

data class Students(
    val studentId : String,
    val studentName : String,
    val studentAge : Int,
    val studentDepartment : String,
    val studentRank : Int,
    var studentCGPA : Float,
    var studentType : Type
)

interface Type{
    fun studentFees() : Float
}

class Dayscholar(val transport:String,val distance:Float,val busType:String) : Type{
    override fun studentFees(): Float {
        when(transport)
        {
            "collegeBus" -> {
                when(busType){
                    "A/C" -> return distance*10+5000
                    "non-A/C" -> return distance*10
                }}

            "ownTransport" -> return 0
        }
    }
}

class Hosteller : Type(){}

class Academics(val studentRank: Int):Type{
    override fun studentFees():Float {
        when(studentRank){
            in 1..40000 -> return 96000
            in 40001..80000 -> return 150000
            in 80001..100000 -> return 200000
            else -> return 250000
        }
    }
}

