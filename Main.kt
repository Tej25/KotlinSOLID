class Test<T: Any?>(private val testingCount: T) {
    fun getValue(): T?{
        var testt : T? = null
        var test1 = hashMapOf(testingCount to testt)
        return test1[testingCount]
    }
}

inline fun <reified T> List<Any>.filterFruits(): List<T> {
    return this.filter{it is T}.map{it as T}
}

inline fun <reified T> ok(value: T){
    println("yo ${T::class.simpleName}")
}

fun main(){
    val test = Test<String>("a")
    println(test.getValue())
    var fruits = listOf(Apple(), Orange(), Banana(), Orange())
    val oranges = fruits.filterFruits<Orange>()
    var temp = mutableListOf(1,2)
    temp.add(3)
    println(oranges)
    ok(Orange())
}

class Orange{

}

class Banana{

}

class Apple {

}

