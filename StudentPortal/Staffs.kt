package StudentPortal

interface Staffs{
    fun salaryCalculation():Float
    //    fun gradeAllocation():String
    // THIS WILL THROUGH ERROR IN NonTeachingStaffs if UNCOMMENTED SINCE IT IS NOT USED
}

interface ProfessorGrade{

    fun gradeAllocation():String

}

class Professors(val yearsOfExperience:Int) : Staffs,ProfessorGrade {

    var grade = gradeAllocation()

    override fun salaryCalculation():Float{

        return when(grade){
            "Professor Grade 1"  -> 500000f
            "Professor Grade 2" -> 300000f
            "Assistant Professor Grade 1" -> 200000f
            "Assistant Professor Grade 2" -> 100000f
            "Trainee" -> 35000f
            else -> 0f
        }

    }

    override fun gradeAllocation() : String {

        return when(yearsOfExperience)
        {
           in 15..20 -> "Professor Grade 1"
           in 10..14 -> "Professor Grade 2"
           in 6..9 -> "Assistant Professor Grade 1"
           in 3..5 ->  "Assistant Professor Grade 2"
            in 1..2 -> "Trainee"
            else -> "No Record Found"

        }

    }

}

class NonTeachingStaffs(val staffDepartment : String): Staffs{

    var designation = staffDepartment
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
