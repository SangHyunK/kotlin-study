package ex_upcasting

open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val id: Int): Person(name, age)

// 서브클래스의 인스턴스를 슈퍼클래스 타입으로 가리키는 것을 업 캐스팅이라고 한다.
// Java의 인터페이스 사용 용도와 비슷한듯?
// Java에서 A라는 인터페이스로 구현 된 객체는 A 인터페이스 타입으로 가리킬 수 있다.
fun main(args: Array<String>): Unit
{
    val person: Person = Student("Jonh", 32, 20171218)
}