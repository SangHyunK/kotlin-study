package ex_overriding_property

// 프로퍼티에는 getter와 setter가 포함되어 있으므로 오버라이딩이 가능하다
// 또, 슈퍼클래스에서 val로 선언된 프로퍼티에 open 키워드를 붙여주면
// 서브클래스에서 var로 오버라이딩이 가능하다
open class AAA
{
    open var number = 10
        get()
        {
            println("AAA number Getter 호출 됨")
            return field
        }
        set(value)
        {
            println("AAA number Setter 호출 됨")
            field = value
        }
}

class BBB: AAA()
{
    override var number: Int
        get()
        {
            println("BBB number Getter 호출 됨")
            return super.number
        }
        set(value)
        {
            println("BBB number Setter 호출 됨")
            super.number = value
        }
}

fun main(args: Array<String>): Unit
{
    val test = BBB()
    test.number = 5
    test.number
}