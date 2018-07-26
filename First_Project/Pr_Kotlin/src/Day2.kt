/***
 * 33 _ 디폴트인수
 *
 ***/


//Unit 반환값이 필요없을 때 사용.
fun main(args:Array<String>) {

   println(getAverage(89,96)) //print  92.5
   getAverage(100,50,true) //75
   println(getAverage(90))        //print 45
    getAverage(66,print=true)       //33
    getAverage(print=true)          //0
    getAverage(print=true,a=10,b=30)    //20

}

//매개 변수를 선언과 동시에 초기화,
fun  getAverage(a:Int=0,b:Int=0,print:Boolean=false):Double{
 val result = (a+b)/2.0
    if(print)
        println(result)
    return result
}

//매개변수의 이름을 지정한 인수는 일반 인수들보다  항상 오른쪽에 있어야한다.
//getAverage(print=true,10,30)
//getAverage(10,print=true,30)
// !Error! : Mixing named and positioned arguments is not allowed (이름이 지정된 인수와 위치로 지정된 인수는 혼재될수 없다.)


