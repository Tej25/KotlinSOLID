package StudentPortal

interface Staffs{
    fun salaryCalculation():Float
    //fun gradeAllocation():String
    //THIS WILL THROUGH ERROR IN NonTeachingStaffs if UNCOMMENTED SINCE IT IS NOT USED
}

interface ProfessorGrade{
    fun gradeAllocation():String
}

class SalaryCalculatorForProfessor(_grade: String): Staffs{
    var grade = _grade
    override fun salaryCalculation(): Float {
        return when(grade) {
            "Trainee" -> 300000f
            "Assistant Professor Grade 2" -> 450000f
            "Assistant Professor Grade 1" -> 600000f
            "Professor Grade 2" -> 800000f
            "Professor Grade 1" -> 1000000f
            else -> {
                println("The Grade doesn't exist")
                0f
            }
        }
    }
}

class SalaryCalculatorForStaff(_designation : String):Staffs{
    var designation = _designation
    override fun salaryCalculation(): Float {
        return when(designation){
            "Gardening" -> 200000f
            "Cleaning" -> 150000f
            "Management" -> 350000f
            "Technical" -> 600000f
            else ->{
                println("The Designation doesn't exist")
                0f
            }
        }
    }
}

fun main(args: Array<String>){

}
