package ex_smart_casts

fun main(args: Array<String>): Unit
{
    val number: Int? = null
    val number2 = 1225

    checkNull(number)
    checkNull(number2)
}

// 컴파일러는 특정 변수에 null 이 들어있지 않다는 것을 완벽하게 추론 가능할 때
// 해당 변수를 자동으로 Not-null 타입으로 바꾼다
// 그래서 any?.toString()가 아닌 any.toString()으로도 호출이 가능 한 것이다.
fun checkNull(any: Any?)
{
    if (any == null)
    {
        println("Null 이 들어왔습니다")
        return
    }

    println(any.toString())
}