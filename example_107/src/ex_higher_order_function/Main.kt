package ex_higher_order_function

// 함수 리터럴은 보통 고차함수에 주로 사용 됨
// 고차함수 : 인수로 함수를 받거나, 함수를 반환하는 함수를 말함

// 해당 함수는 함수 리터럴을 인자로 받고 있다
fun decorate(task: () -> Unit) {
    println("=== 작업시작 ===")
    task()
    println("=== 작업종료 ===")
}

fun main() {
    decorate {
        val a = 10; val b = 5
        println("$a + $b = ${a + b}")
    }
    decorate {
        println("some"); println("tasks")
    }
}