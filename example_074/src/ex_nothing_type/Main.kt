package ex_nothing_type

// throw Exception() 표현식은 Nothing 타입을 갖는다
// Nothing 타입은 어떠한 타입과도 호환이 가능하다
fun throwing(): Nothing = throw Exception()

fun main(args: Array<String>): Unit
{
    println("start")
    val i: Int = throwing()
    println(i)
}

// Nothing 타입의 사용 예시
fun validate(num: Int)
{
    // throw Exception 표현식은 Nothing 타입이기 때문에 Int 표현식에 넣는 것 이 허용 된다.
    // 만약 throw Exception 이 표현식이 아니였다면 else 발생 시 Unit 타입이 리턴 되므로
    // 이 상황에서 if-else 표현식 자체를 사용 할 수가 없다
    val result: Int =
        if(num >= 0) num
        else throw Exception("num이 음수입니다.")
}