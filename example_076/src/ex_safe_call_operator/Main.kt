package ex_safe_call_operator

import Building

// 안전한 호출 연산자 ?.
// Nullable 한 참조 변수의 프로퍼티와 멤버 함수에 접근하기 위해서는 . 대신 ?. 연산자를 반드시 사용해야 한다
// ?. 은 null 값에 안전한 연산자이다.
// 참조변수?.프로퍼티 : 참조변수가 null 인 경우 해당 표현식은 null 값을 가지게 됨
// 참조변수?.멤버함수() : 참조변수가 null 인 경우 멤버함수를 호출하지 않으며 null 값을 가지게 된다.

fun main(args: Array<String>): Unit
{
    var obj: Building? = null
    obj?.print()
    obj?.name = "건물"

    obj = Building()
    obj?.name = "서울월드컵경기장"
    obj?.date = "2001년 11월 10일"
    obj?.area = 21_6712
    obj?.print()
}