/***
 *  23 _ when if
 *  when (비교할 대상 선언)
 *  찾으면 밖으로 나온다.
 *
 * */


fun main(args:Array<String>):Unit {

   val score = 99

    when (score/ 10){           //비교의 대상이 되는 타깃을 정한다.

        6->{println("D")}   //score/10 ==6 인지.
        7->{println("C")}
        8->{println("B")}
        9,10->{println("A")} //쉼표를 이용하여 값 여러개를 지정할 수 있다.
        else ->{println("F")} // 아무것도 아닐때.
    }
    println("Test")



}



