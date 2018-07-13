

fun sum1 (a:Int, b:Int): Int {
    return a + b ;
}


//Retrun 값이 생략되는경우.
fun sum2(a:Int,b:Int)= a+b

fun printKotlin1():Unit{        //Unit이라는 뜻은 void라는 뜻과 같은 뜻이다.
    println("Hello Kotlin")
}

fun printKotlin2(){             //없으면 생략된걸로 봐도 됨.
    println("HELLO kOTLIN")
}

fun maxOf(a:Int, b:Int):Int {
    if(a>b){
        return a
    } else {
        return b
    }
}

//	SingleTone이 java에서 뭐야
fun maxOf_(a:Int,b:Int) = if(a>b) a else b;

//nullable null이 나올수 있다는것을 명시.
fun parseInt(str:String):Int? { }

fun printProduct(arg1 : String , arg2 : String){
    val x:Int? = parseInt(arg1);
    val y:Int?= parseInt(arg2);

    if(x !=null && y!=null){
        println(x *y)
    } else {
        println("either '$arg1' or '$arg2 ' is not a number  ")
    }

}

//자동 타입 변환

fun getStringLength(obj:Any):Int? {
    if(obj is String){
        return obj.length
    }
    return null
}

//Java에서 switch case 문과 동일하다.
fun describe(obj:Any):String =
        when (obj) {
            1 ->"One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknow"
        }

fun main(args: Array<String>) {

    //val 읽기 전용 변수 : 값의 할당이 1회만 가능 Java의 final과 유사하다.
    //val a.Int =1;
    val b=2;        //뒤에 Type을 생략해주면 알아서 유추한다.
    val c:Int ;

    //var Murable 변수 : 쓰고 지우는게 가능
    var x =5;
    x +=1;

    var a =1 ;
    val s1 = "a is $a"

    a=2

    //replace is -> was로 바꿔줌.
    val s2 = "${s1.replace("is","was")},but now is $a"
    println ("s2는 $s2")

    printProduct("5","");

    val items = listOf("apple","banana","kiwi")
    var index=0
    while(index < items.size){
        println("items at $index is ${items[index]}")
        index++
    }


    //변수 K가 범위 안에 있는지 체크
    val K =3
    if (K in 1..10){
        println("fits in range")
    }

    //for 문을 이렇게 씀
    for (x in 1..5){
        print(x)
    }

    //collections를 이용한다고 함.



    for (item in items){
        println(item)
    }

    //ListOf 말고도 setOF으로도 List 만들수 있나봄
    // in Collection 안에 있는걸 확인한느듯 Collection이란 list를 뜻함 .
    val items2 = setOf("APPLE","BANANA","KIWI")
    when {
        "oragne" in items2 -> println("here u r orange")
        "apple" in items2 -> println("apple is here")
    }

    //람다를 이용해서 이런걸 할수 있대 근데 람다가 뭔지 모름.
    items2
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map{it.toUpperCase()}
            .forEach{println(it)}


}

