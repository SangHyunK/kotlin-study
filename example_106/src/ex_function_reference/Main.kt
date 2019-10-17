package ex_function_reference

fun plus(a: Int, b: Int) = println("plus 호출 됨 ${a + b}")

object Object {
    fun minus(a: Int, b: Int) = println("Object 의 minus 호출 됨 ${a - b}")
}

class Class {
    fun average(a: Int, b: Int) = println("Class average 호출 됨 ${(a + b) / 2} ")
}

fun main() {
    var instantFunc: (Int, Int) -> Unit
    // 함수 plus 의 참조값을 instantFunc 에 저장하고 있다.
    // 함수 이름 앞에 :: 붙이면 표현식은 그 함수의 참조 값이 되며, 그 타입은 그 함수의 시그니처에 맞는 함수타입이 됨
    instantFunc = ::plus
    instantFunc(60, 27)

    // 객체의 멤버함수를 대입하는 방법
    instantFunc = Object::minus
    instantFunc(36, 12)

    // 클래스의 인스턴스의 멤버 함수를 대입하는 방법
    instantFunc = Class()::average
    instantFunc(25, 15)
}