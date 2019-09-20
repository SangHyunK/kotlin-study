package ex_inheritance

open class Person(val name: String, val age: Int)

// 상속 시 반드시 슈퍼클래스의 생성자를 호출해야 한다.
class Student(name: String, age: Int, val id: Int): Person(name, age)

fun main(args: Array<String>): Unit
{
    val person = Person("홍길동", 35)
    val student = Student("김길동", 23, 20171217)
}