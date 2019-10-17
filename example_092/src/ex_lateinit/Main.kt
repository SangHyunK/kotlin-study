package ex_lateinit

// 클래스의 프로퍼티는 선언과 동시에 초기화하거나 또는 init 블록에서 반드시 초기화를 해주어야 한다
// 그러나 이런 강제성은 좀 불편하다
// lateinit 를 사용하면 클래스 안에서 바로 초기화 하지 않아도 된다
// lateinit 는 var 키워드만 사용 가능

// 점을 표현하는 클래스
class Point(val x: Int, val y: Int)

// 사각형을 표현하는 클래스
class Rect
{
    lateinit var pt: Point
    lateinit var pt2: Point

    val width: Int get() = pt2.x - pt.x
    val height: Int get() = pt2.y - pt.y
    val area get() = width * height
}

fun main(args: Array<String>): Unit
{
    val rect: Rect = Rect()
    rect.pt = Point(3, 3)
    rect.pt2 = Point(6, 5)

    println("너비: ${rect.width}")
    println("높이: ${rect.height}")
    println("넓이: ${rect.area}")
}