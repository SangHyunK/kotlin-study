package ex_overriding

// 슈퍼클래스의 멤버함수와 시그니처가 동일한 멤버 함수를 서브클래스에서 선언하면,
// 슈퍼클래스 멤버 함수의 동작을 변경 할 수 있다.
// 이것을 오버라이딩 이라고 한다.
// 코틀린에서 멤버 함수의 오버라이딩을 허용하려면 멤버 함수에도 open 키워드를 붙여 주어야 한다.
open class AAA
{
    open fun func() = println("AAA")
}

class BBB: AAA()
{
    // override 키워드는 그 자체로 open 키워드가 포함되어 있다
    // 즉, 한 번 override 된 객체는 계속해서 재 오버라이딩이 가능하다.
    // 이 동작을 막으려면 final 키워드를 사용하면 된다
    // ex) final override fun func()
    override fun func()
    {
        super.func()
        println("BBB")
    }
}

fun main(args: Array<String>): Unit
{
    AAA().func()
    BBB().func()
}