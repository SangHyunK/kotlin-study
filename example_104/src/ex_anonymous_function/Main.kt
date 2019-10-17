package ex_anonymous_function

fun main() {
    // 익명함수는 return 지정이 가능하기 때문에 마지막 표현식이 자동으로 반환되는 람다 함수에 비해 버그를 일으 킬 확률이 적다
    // 그 외 익명함수와 람다함수 차이는 없는듯..?
    val instantFunc: (Int) -> Unit = fun(number: Int): Unit {
        println("Hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}