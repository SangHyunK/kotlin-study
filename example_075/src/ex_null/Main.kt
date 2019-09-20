package ex_null

import ex_upcasting.Person

// 타입 뒤에 ?를 넣으면 Nullable 하게 만들 수 있다
// Nullable 이란 null 값을 지정 할 수 있는 변수를 뜻한다
// null 은 참조변수가 어떠한 객체도 가리키지 않고 있는 것을 뜻한다
// null 은 Nothing? 타입의 표현식이다
// 자바는 기본적으로 모든 참조타입에 null 지정이 가능하지만
// 코틀린의 경우 기본적으로 지정이 불가능하다.

fun main(args: Array<String>): Unit
{
    var person: Person? = Person("K", 30)
    person = null

    var num: Int? = null
    num = 10
}