package object_extends_class

open class Person(val name:String, val age:Int){

    open fun print(){
        println(" $name : name")
        println(" $age : age")

    }

}




fun main(args: Array<String>){
    val custom :Person= object : Person("Kimsoo",26)
    {
        override fun print(){
            println("It is object")
        }
    }

    custom.print()
}
