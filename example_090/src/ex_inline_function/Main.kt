package ex_inline_function

// inline 키워드는 함수 호출문을 함수의 몸체로 대체한다
// 함수의 몸체로 대체하는 것이기 때문에 문장이 적고 빈번히 호출되는 함수만 inline 로 만들 것을 권장한다.
// inline 함수는 재귀호출이 불가

inline fun hello()
{
    println("Hello")
    println("Kotlin")
}

fun main(args: Array<String>): Unit
{
    hello()
    hello()
    hello()

    // 위 호출문은 다음과 같이 변경된다
    /*
        println("Hello")
        println("Kotlin")
        println("Hello")
        println("Kotlin")
        println("Hello")
        println("Kotlin")
    */
}