package StudentPortal

data class Staffs(
    val staffId : String,
    val staffName : String,
    val staffAge : Int,
    val staffDesignation : Staff,
    val staffDepartment : StaffDepartment,
    val staffExperience : Int
){
    var professorGrade : String = Professor(staffExperience).allocateGrade().name
    var salary : Float = Professor(staffExperience).calculateSalary()
}
