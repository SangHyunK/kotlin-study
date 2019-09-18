// 레이블
// break 는 반복문을 하나만 빠져나오지만 레이블을 사용한다면 레이블 범위에 해당하는 반복문을 빠져 나올 수 있다

fun main(args: Array<String>): Unit
{
    var x = 0
    var y = 0

    outer@ while(x <= 20)
    {
        y = 0
        while(y <= 20)
        {
            if(x + y == 15 && x - y == 5)
                break@outer
            y += 1
        }
        x += 1
    }

    println("X:$x, y:$y")
}