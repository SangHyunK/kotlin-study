package ex_notnull_asserting_operator

import Building

// Nullable 타입을 강제로 Not-null 타입으로 캐스팅
fun main(args: Array<String>)
{
    var obj: Building? = Building()
    obj!!.name = "서울 시청"
    println(obj!!.name)

    obj = null
    obj!!.print()
}