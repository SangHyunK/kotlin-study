package ex_companion_object

// 동반자 객체(Companion Object)는 클래스 안에 포함되는 이름 없는 객체이다.
// 어떤 클래스의 모든 인스턴스가 공유하는 객체를 만들고 싶을 때 사용한다.
// 동반자 객체는 클래스 당 한 개만 존재한다.
// 코틀린에는 static 키워드가 존재하지 않기 때문에 static 효과를 얻고 싶다면 동반자 객체를 사용해야 한다

// connection pool 같은 객체를 만들 때 좋을 것 같다

class Person private constructor()
{
    companion object
    {
        fun create(): Person
        {
            countCreated += 1
            return Person()
        }

        var countCreated = 0
            private set
    }
}

fun main(args: Array<String>): Unit
{
    val a = Person.create()
    val b = Person.create()
    println(Person.countCreated)
}