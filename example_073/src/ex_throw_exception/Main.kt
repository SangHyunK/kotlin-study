package ex_throw_exception

// 예외 던지는 법
// throw Throwable 타입 표현식
// throw Exception : Exception 객체는 Throwable를 상속하기 때문에 가능하다
// Exception 생성자로 에러 출력 시 메시지 지정이 가능하다
// 코틀린에서는 java의 throws 키워드를 제거했다

fun main(args: Array<String>): Unit
{
    try
    {
        something()
    }
    catch(e: Exception)
    {
        println(e.message)
    }
}

fun something()
{
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

// a와 b를 나눈 몫을 반환
fun div(a: Int, b: Int): Int
{
    if(b == 0)
        throw Exception("0으로 나눌 수 없습니다")

    return a / b
}