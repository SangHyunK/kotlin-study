package ex_elvis_operator

// 엘비스연산자(?:)는 왼쪽의 피연산자가 null 이 아니면 그 값을 그대로 쓰고
// null 이면 우측의 피연산자로 대체하는 연산자이다 (삼항연산자랑 비슷한듯?)
fun main(args: Array<String>): Unit
{
    val number: Int? = null
    println(number ?: 0)

    val number2: Int? = 15
    println(number2 ?: 0)
}