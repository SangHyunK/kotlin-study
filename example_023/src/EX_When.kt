fun main(args: Array<String>): Unit
{
    val score = 64

    when(score / 10)
    {
        6 -> { println('D') }
        7 -> { println('C') }
        8 -> { println('B') }
        9, 10 -> { println('A') }
        else -> { println('F') } // 이건 swich case 문에서 default를 담당
    }

    println("test")
}