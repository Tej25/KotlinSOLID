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
