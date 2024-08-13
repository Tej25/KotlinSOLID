package StudentPortal

fun main(){
    var students = mutableListOf(
        Students("20MIS1134","Tejas",25,"MIS",4000,8.6f,Hosteller("AC",3,"SPECIAL")) ,
        Students("20MIS1134","Tejas",25,"MIS",4000,8.6f,Dayscholar("COLLEGEBUS",3f,"AC"))
    )
    students.forEach{
        println(it.studentType.studentFees() + Academics(it.studentRank).studentFees())
    }
}