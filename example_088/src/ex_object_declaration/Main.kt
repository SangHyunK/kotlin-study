package ex_object_declaration

// 싱글톤 패턴 작성이 Java 보다 간편해짐
// 프로그램을 작성하다 보면 프로그램 전체에서 공유 할 수 있는 하나뿐인 객체가 필요 할 경우가 생긴다.

object Person
{
    var name: String = ""
    var age: Int = 0

    fun print()
    {
        println(name)
        println(age)
    }
}

fun main(args: Array<String>): Unit
{
    // 식별자 Person 으로 객체에 바로 접근이 가능함
    Person.name = "Singleton"
    Person.age = 45
    Person.print()
}