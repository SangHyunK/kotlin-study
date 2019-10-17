package ex_reified_type_parameter

// inline 함수 : 인라인 함수를 호출하면 컴파일 되는 순간에 호출한 부분에 아래 코드가 쓰여지게 됨
inline fun <reified T> check() {
    val number = 0
    if(number is T)
        println("T는 Int 타입 입니다.")
}

fun main() {
    // 이 코드는
    check<Int>()

    /*
    컴파일 시 아래와 같이 변한다
    val number = 0
    if(number is T)
        println("T는 Int 타입 입니다.")
    */
}