package StudentPortal

fun main(){
    var students = mutableListOf(
        Students("20MIS1134","Tejas",25,MIS(),4000,8.6f,Hosteller("AC",3,"SPECIAL")) ,
        Students("20MIS1134","Tejas",25,MIA(),4000,8.6f,Dayscholar("COLLEGEBUS",3f,"AC")),
        Students("20MIS1134","Tejas",25,MIA(),4000,8.6f,Dayscholar("COLLEGEBUS",3f,"AC"))
    )
    var departments = mutableSetOf<String>()

    students.forEach{
        println(it.studentType.studentFees() + Academics(it.studentRank).studentFees())
        if(it.studentDepartment::class.simpleName !in departments){
            it.studentDepartment::class.simpleName?.let { it1 -> departments.add(it1) }
        }
    }

    departments.forEach{
        GetDepartmentClassCount(it)
    }
}