package ex_extension_function_companion_object

// 동반자 객체에도 확장함수 사용이 가능하다
// fun 클래스 이름.Companion.함수 이름()
// 동반자 객체의 확장함수 접근 시 Companion 을 반드시 적어주어야 한다

class Person { companion object }

fun Person.Companion.create() = Person()

fun main(args: Array<String>) = Person.create()