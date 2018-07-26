
typealias  Number = Int


fun main (args:Array<String>): Unit {


    println("prefix란 '${"집에가고싶다".startsWith("집")}'   ")
    //println("prefix란 '${"집에가고싶다".prefix("집")}'   ")

}


fun prefix(x:Any)=when(x){
    is String -> x.startsWith("prefix")
    else -> false
}



