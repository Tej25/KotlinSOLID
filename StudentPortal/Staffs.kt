package StudentPortal

open class Staff : Salary {
    override fun calculateSalary(): Float {
        TODO()
    }
}

interface Salary {
    fun calculateSalary(): Float
}

interface Grade {
    fun allocateGrade(): StaffDepartment
}

class Professor(val yearsOfExperience: Int) : Staff(), Grade {
    override fun calculateSalary(): Float {
        return when (allocateGrade()) {
            StaffDepartment.ProfessorGrade1 -> 500000f
            StaffDepartment.ProfessorGrade2 -> 300000f
            StaffDepartment.AssistantProfessorGrade1 -> 200000f
            StaffDepartment.AssistantProfessorGrade2 -> 100000f
            StaffDepartment.Trainee -> 35000f
            else -> 0f
        }
    }

    override fun allocateGrade(): StaffDepartment {
        return when (yearsOfExperience) {
            in 15..100 -> StaffDepartment.ProfessorGrade1
            in 10..14 -> StaffDepartment.ProfessorGrade2
            in 6..9 -> StaffDepartment.AssistantProfessorGrade1
            in 3..5 -> StaffDepartment.AssistantProfessorGrade2
            else -> StaffDepartment.Trainee
        }
    }
}

class NonTeachingStaff(val department: StaffDepartment) : Staff() {
    override fun calculateSalary(): Float {
        return when (department) {
            StaffDepartment.Gardening -> 200000f
            StaffDepartment.Cleaning -> 150000f
            StaffDepartment.Management -> 350000f
            StaffDepartment.Technical -> 600000f
            else -> {
                println("The Designation doesn't exist")
                0f
            }
        }
    }
}

enum class StaffDepartment {
    ProfessorGrade1, ProfessorGrade2, AssistantProfessorGrade1, AssistantProfessorGrade2, Trainee,
    Professor, Gardening, Cleaning, Management, Technical
}
