// 디폴트 인수
// 자바와는 달리 코틀린은 인자에 디폴트 인수를 넣어 줄 수 있다.

// 반환타입을 적어주지 않으면 기본적으로 Unit 타입으로 지정 된다
fun main(args: Array<String>) {
    println(getAverage(89, 96))
    getAverage(100, 50, true)
    println(getAverage(90))
    getAverage(66, print = true)
    getAverage(print = true)
    getAverage(print = true, a = 10, b = 30)
}

fun getAverage(a: Int = 0, b: Int = 0, print: Boolean = false): Double
{
    val result = (a + b) / 2.0
    if(print)
        println(result)

    return result
}