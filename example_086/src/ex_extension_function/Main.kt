package ex_extension_function

// 확장함수를 선언하는 법 : 함수를 주입할 클래스.
// "함수를 주입할 클래스"를 리시버(Receiver) 타입이라고 부른다
// this 를 사용하면 리시버 타입의 프로퍼티나 멤버 함수에 접근이 가능하다 ex) this.length
// 단, private or protected 인 멤버에는 접근이 불가하다
// 만약 확장함수를 기존 리시버 타입의 멤버의 함수이름과 동일하게 작성한다면 확장함수는 동작하지 않는다
// (우선순위에서 밀림)

// 문자열이 숫자로만 이루어져 있는지 판단하는 확장 함수
fun String.isNumber(): Boolean
{
    var i = 0
    while(i < this.length)
    {
        // 숫자가 아닌 문자가 하나라도 들어있으면 false 반환
        if(!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }

    // 모든 조건을 통과하면 true 반환
    return true
}

fun main(args: Array<String>): Unit
{
    println("1234567890".isNumber())
    println("500 원".isNumber())
}