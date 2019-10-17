package ex_const

// const 가 붙은 변수는 리터럴만 들어갈 수 있다
// inline 함수와 비슷한 역할을 한다
// 변수에 들어가는 코드를 변수에 저장된 값으로 대체

// 코틀린 문법 중에는 리터럴만 와야하는 자리가 몇 군데 존재하는데 그러한 곳에 쓰면 좋다

const val hello = "Hello " + "World!"

object Foo
{
    const val bar = "bar"
}

fun main(args: Array<String>): Unit
{
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}