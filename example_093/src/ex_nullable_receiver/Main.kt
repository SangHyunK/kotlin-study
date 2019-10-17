package ex_nullable_receiver

// 확장함수를 응용하면 참조 변수에 null 이 지정되었어도 함수 호출이 가능하도록 할 수 있다
// 리시버타입에 ?가 붙어있는 것이 바로 Nullable 리시버이다

fun String?.isNumber()
{
    if(this == null)
        println("문자열이 null 입니다")
}

fun main(args: Array<String>): Unit
{
    val empty: String? = null
    empty.isNumber()
}