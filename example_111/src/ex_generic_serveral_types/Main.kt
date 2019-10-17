package ex_generic_serveral_types

// 타입 인수를 여러 개 받으려면 fun 키워드와 함수 이름 사이를 <타입1, 타입2 ...> 형식으로 적는다

// 타입 매개변수 T 와 R 을 선언하여, 두 개의 타입 인수를 받을 수 있게 했다. mapper 매개변수에는
// T 타입을 R 타입으로 변환하는 함수를 받도록 했다.
// T.map 에서 볼 수 있듯이, 확장 함수의 리시버에도 타입 매개변수를 적용 할 수 있다.
// 사실상 타입이 쓰일 수 있는 대부분의 자리에 타입 매개변수를 쓸 수 있다고 보면 된다.
fun <T, R> T.map(mapper: (T) -> R): R {
    return mapper(this)
}

fun main() {
    val square: Int = 11.map {
        it * it
    }

    println(square)
}