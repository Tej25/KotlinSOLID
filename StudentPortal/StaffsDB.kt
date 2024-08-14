package StudentPortal

data class Staffs(
    val staffId : String,
    val staffName : String,
    val staffAge : Int,
    val staffDesignation : Staff,
    var staffDepartment : StaffDepartment,
){
    var staffSalary : Float = 0f
}