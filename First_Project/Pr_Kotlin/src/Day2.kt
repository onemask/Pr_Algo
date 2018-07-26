/***
 * 29 _ ****Lable 사용. 
 *
 ***/


fun main(args:Array<String>):Unit {

    var x=0
    var y=0

    outer@ while(x<=20){
        y=0
        while(y<=20){
            if(x+y == 15 && x-y ==5)
                break@outer
            y+=1
        }
        x+=1
    }
    println("x : $x, y : $y")

    //(kotlin에서 Unit은 무엇을 말하는겨?

}



