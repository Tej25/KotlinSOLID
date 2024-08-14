package StudentPortal

data class Students(
    val studentId : String,
    val studentName : String,
    val studentAge : Int,
    val studentDepartment : Department,
    val studentRank : Int,
    var studentCGPA : Float,
    var studentType : Type
)

