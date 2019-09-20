package ex_object_extends_class

open class Person(val name: String, val age: Int)
{
    open fun print()
    {
        println("이름: $name")
        println("나이: $age")
    }
}

// 아래와 같이 object 객체도 클래스를 상속받을 수 있다
// 일회성으로 사용하기에 좋다
fun main(args: Array<String>): Unit
{
    val custom: Person = object: Person("Alan", 23)
    {
        override fun print()
        {
            println("It's a object")
        }
    }

    custom.print()
}