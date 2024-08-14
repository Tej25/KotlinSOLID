package StudentPortal

interface Staff{
    fun calculateSalary(): Float
}

interface Grade {
    fun allocateGrade(): String
}

class Professor(val yearsOfExperience: Int) : Staff, Grade {

    override fun calculateSalary(): Float {
        return when (allocateGrade()) {
            "Professor Grade 1" -> 500000f
            "Professor Grade 2" -> 300000f
            "Assistant Professor Grade 1" -> 200000f
            "Assistant Professor Grade 2" -> 100000f
            "Trainee" -> 35000f
            else -> 0f
        }
    }

    override fun allocateGrade(): String {
        return when (yearsOfExperience) {
            in 15..20 -> "Professor Grade 1"
            in 10..14 -> "Professor Grade 2"
            in 6..9 -> "Assistant Professor Grade 1"
            in 3..5 -> "Assistant Professor Grade 2"
            in 1..2 -> "Trainee"
            else -> "No Record Found"
        }
    }
}

class NonTeachingStaff(val department: String) : Staff {

    override fun calculateSalary(): Float {
        return when (department) {
            "Gardening" -> 200000f
            "Cleaning" -> 150000f
            "Management" -> 350000f
            "Technical" -> 600000f
            else -> {
                println("The Designation doesn't exist")
                0f
            }
        }
    }
}
