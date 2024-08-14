package StudentPortal

interface Staffs{
    fun salaryCalculation():Float
//    fun gradeAllocation():String //THIS WILL THROUGH ERROR IN NonTeachingStaffs if UNCOMMENTED SINCE IT IS NOT USED
}

interface ProfessorGrade{

    fun gradeAllocation():String

}

class TeachingStaffs() : Staffs,ProfessorGrade {

    fun salaryCalculation(){

    }

    fun gradeAllocation(){

    }

}

class NonTeachingStaffs(): Staffs{

    fun salaryCalculation(){

    }

}