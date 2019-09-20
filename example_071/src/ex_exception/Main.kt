package ex_exception

import java.lang.NumberFormatException

// Java와 크게 다른 게 없음
fun main(args: Array<String>): Unit
{
    try
    {
        val str = "abcd"
        val num = str.toInt()
        println(num)
    }
    catch(e: NumberFormatException)
    {
        println("문자열은 숫자형으로 변경 할 수 없다")
    }
    finally
    {
        println("프로그램 종료")
    }
}