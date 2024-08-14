package StudentPortal

object DepartmentCount {
    private val departmentCount = mutableMapOf<String, Int>()

    fun incrementCount(departmentName: String) {
        departmentCount[departmentName] = departmentCount.getOrDefault(departmentName, 0) + 1
    }

    fun decrementCount(departmentName: String) {
        departmentCount[departmentName] = (departmentCount[departmentName] ?: 1) - 1
    }

    fun getCount(departmentName: String): Int {
        return departmentCount[departmentName] ?: 0
    }
}

abstract class Department {
    init {
        val departmentName = this::class.simpleName ?: "Unknown"
        DepartmentCount.incrementCount(departmentName)
    }
}

class MIA : Department()
class MIS : Department()
class BCE : Department()
class BCS : Department()
class BPS : Department()

fun getDepartmentClassCount(department: Department): String {
    val departmentName = department::class.simpleName ?: "Unknown"
    DepartmentCount.decrementCount(departmentName)
    return ("Class count of $departmentName is: ${DepartmentCount.getCount(departmentName)}")
}
