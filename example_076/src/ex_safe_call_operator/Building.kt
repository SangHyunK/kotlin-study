// 어떤 클래스가 다른 어떠한 클래스도 상속받지 않을 때
// 코틀린은 기본적으로 Any 클래스를 상속받는다
// ※ Java의 Object 객체를 상속받는 것과 비슷한 것 같다.

// Any에는 세 가지 멤버 함수가 존재한다 (equals, hashCode, toString)
// 모든 클래스는 Any 클래스를 상속받게 되므로 위 3개의 멤버 함수는 모든 클래스가 갖는다.

// equals : == 연산자를 오버로딩하는 함수
// hashCode : 객체 고유의 해시코드를 반환하는 함수
// toString : String 타입으로 변환하는 함수

class Building(var name: String = "", // 건물 명
    var date: String = "", // 건축일자
    var area: Int = 0) // 면적(m^2)
{
    override fun toString() =
            "이름:${this.name}\n" +
            "건축일자:${this.date}\n" +
            "면적:${this.area} m^2"

    fun print() = println(toString())
}