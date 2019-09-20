package ex_access_modifier

// 코틀린의 접근 지정자는 4가지가 있다
// public : Java와 동일, 코틀린은 Java와 달리 지정자를 입력하지 않으면 public 가 기본으로 지정 됨
// internal : 같은 모듈 안에서 접근 가능, 여기서 말하는 모듈은 IntelliJ 프로젝트의 모듈을 가리킨다
//            (자세한 설명은 생략한다)
// protected : 클래스 내부와, 서브클래스 안에서만 접근 가능
// private : 프로퍼티와 멤버 함수의 경우 같은 클래스 안에서만 접근 가능,
//           그 외의 경우 같은 파일 내에서만 접근 가능

class Rectangle(private val width: Int, private val height: Int)
{
    val area: Int
        get() = width * height
}

fun main(args: Array<String>): Unit
{
    val rect = Rectangle(5, 7)
    // println(rect.width) // 에러 발생!
}