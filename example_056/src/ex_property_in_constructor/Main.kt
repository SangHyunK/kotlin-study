package ex_property_in_constructor

// 생성자와 프로퍼티 한 번에 사용하기
class Car(val name: String, val speed: Int = 0)

fun main(args: Array<String>)
{
    val car = Car("My Car")
    println(car.name)
    println(car.speed)
}