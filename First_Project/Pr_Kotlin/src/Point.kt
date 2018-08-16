package ex_package
import ex_func.*

// Chapt 58. 프로퍼티 Geter와 Setter.
class  Point(var x:Int=0,var y:Int=0){

    //멤버 함수 앞에 operator 을 붙였다.
    // Point인스턴스 간에 연사자를 사용했을때 이 멤버 함수를 대신 호출해달라는 뜻
    operator fun plus(other:Point):Point{
        return Point(x + other.x ,y + other.y)
    }
    operator fun minus(other:Point):Point{
        return Point(x-other.x,y -other.y)
    }
    operator fun times(number: Int):Point{
        return Point(x * number,y*number)
    }
    operator fun div(number:Int):Point{
        return Point(x / number,y/number)
    }

    fun print(){
        println ("x :$x, y:$y " )
    }
}

