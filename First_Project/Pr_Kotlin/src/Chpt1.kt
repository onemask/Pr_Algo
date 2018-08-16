//package ex_package
//import ex_func.*
//
//// Chapt 58. 프로퍼티 Geter와 Setter.
//class  Chpt1(var x=0,var y=0){
//
//    operator fun plus(other:Point):Point{
//        return Point(x + other.x ,y + other.y)
//    }
//    operator fun minus(other:Point):Point{
//        return Point(x-other.x,y -other.y)
//    }
//    operator fun times(number: Int):Point{
//        return Point(x * number,y*number)
//    }
//    operator fun div(number:Int):Point{
//        return Point(x / number,y/number)
//    }
//
//    fun print(){
//        println ("x :$x, y:$y " )
//    }
//}
//
