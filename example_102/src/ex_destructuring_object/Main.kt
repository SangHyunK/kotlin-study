package ex_destructuring_object

data class Employee(val name: String, val age: Int, val salary: Int)

fun main() {
    // 데이터 클래스에 한하여 아래와 같이 변수를 쪼갤 수 있다
    // 언더스코어(_)는 사용되지 않는 변수에 사용하면 된다
    val (name, _, salary) = Employee("John", 30, 3300)
    println(name); println(salary)
}