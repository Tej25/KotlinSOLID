package StudentPortal

object DepartmentCount{
    var department = hashMapOf<String,Int>()
}

abstract class Department{
    init{
        val departmentName = this::class.simpleName!!
        if (departmentName in DepartmentCount.department){
            DepartmentCount.department[departmentName] = DepartmentCount.department[departmentName]!! + 1
        }
        else{
            DepartmentCount.department[departmentName] = 1
        }
    }
}

class MIA() : Department(){}

class MIS() : Department(){}

fun GetDepartmentClassCount(department: String){
    //val departmentName = department::class.simpleName!!
    println("Class count of $department is : ${DepartmentCount.department[department]}")
}