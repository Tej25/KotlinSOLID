package StudentPortal

data class Students(
    val studentId : String,
    val studentName : String,
    val studentAge : Int,
    val studentDepartment : Department,
    val studentRank : Int,
    var studentCGPA : Float,
    var studentType : Type
){
    var studentFees : Float = 0.0f
    fun printDetails() {
        println("Student ID: $studentId")
        println("Student Name: $studentName")
        println("Student Age: $studentAge")
        println("Student Department: $studentDepartment")
        println("Student Rank: $studentRank")
        println("Student CGPA: $studentCGPA")
        println("Student Type: $studentType")
        println("Student Fees: $studentFees")
    }
}

