/***
 * if 블록과 else 블록의 마지막 표현식 타입은 일치해야한다.
 * if 블록의 마지막 표현식이 Int타입이였으면 else 블록또한 마찬가지.
 */


fun main(args:Array<String>):Unit {

   val value : Int = if (10 >5) {
       println("10은 5보다 크다.")
       10
   }
    else{
       println("10은 5보다 크지 않다.")
        5
   }
    print(value)

}



