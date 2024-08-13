package StudentPortal

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
