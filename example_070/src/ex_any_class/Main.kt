package ex_any_class

fun main(args: Array<String>)
{
    val building = Building("코틀린", area = 100)
    printObject(building)
}

// 코드상으로는 Any객체의 toString를 호출하고 있으나 Building 객체를 넘겼기 때문에
// Building 객체에 있는 toString를 호출했다
fun printObject(any: Any)
{
    println(any.toString())
}