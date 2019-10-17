package ex_lambda_expression

fun main() {
    // (Int) -> Unit : 매개변수가 Int 타입이고 반환타입이 Unit 인 함수를 저장할 수 있는 타입이다
    // 이처럼 함수를 저장할 수 있는 타입을 함수타입이라고 한다.
    val instantFunc: (Int) -> Unit

    // 이부분을 리터럴 함수라고 말한다
    // -> 를 경계로 매개변수와 함수가 분리 된다.
    // 만약 매개변수가 없다면 number: Int -> 부분 없이 함수가 바로 나오면 된다.
    // 함수리터럴에는 return 을 적지 않는다.
    // 함수리터럴의 반환값은 함수 내용의 맨 마지막 표현식
    instantFunc = { number: Int ->
        println("Hello $number")
    }

    // 리터럴 함수의 두 가지 호출 방식
    // invoke 의 경우 함수가 nullable 타입일 경우 instantFunc?.invoke(33) 과 같은 형태로 사용하기 편하다
    // 함수타입도 참조타입이다
    instantFunc(33)
    instantFunc.invoke(33)
}