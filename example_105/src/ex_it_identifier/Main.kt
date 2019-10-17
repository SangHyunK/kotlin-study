package ex_it_identifier

fun main() {
    // 리터럴함수에 매개변수를 생략하면 it 이라는 특별한 식별자가 만들어진다
    // 여기서 it 은 우리가 생략한 int 타입의 매개변수를 대신하는 역할을 한다
    val instantFunc: (Int) -> Unit = {
        println("Hello $it")
    }

    instantFunc(33)
}