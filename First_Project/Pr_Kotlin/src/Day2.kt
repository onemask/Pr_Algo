/***
 * 31 _ *****Function.
 *
 ***/
//(kotlin에서 Unit은 무엇을 말하는겨?


fun main(args:Array<String>):Unit {
    println(cToF(30))
    println(getAverage(89,96))
}

fun  getAverage(a: Int,b:Int): Double {
    return (a+b)/2.0
}

//매개변수는 무조건 val로 선언된다. 
fun cToF(i: Int): Double {
    return i*1.8 +32
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
