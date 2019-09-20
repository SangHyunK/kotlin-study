package ex_extension_property

// 확장프로퍼티에는 Field 라는 개념이 존재하지 않는다

// 문자열이 큰지 판단하는 확장 프로퍼티
val String.isLarge: Boolean
    get() = this.length >= 10

fun main(args: Array<String>): Unit
{
    println("1234567890".isLarge)
    println("500 원".isLarge)
}