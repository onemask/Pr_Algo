/***
 *  32_ 가변인수.
 *
 */





fun main (args: Array<String>) {

    println(getSumOf2(1,2,3))
    println(getSumOf2(4,5,6))
    println(getSumOf(7,8,9)) //<-이것도 출력 되나여?


}

fun getSumOf2(vararg numbers: Int ):Int{

    val count = numbers.size;
    var i =0; var sum=0

    while(i<count){
        sum+=numbers[i]
        i+=1
    }

    return sum;
}