package ex_Any_class

class Building (var name:String ="",
                val date:String ="",
                val area:Int    =0  )

{
     fun print()=
     "이름 : $name\n" +
    "건축일자 : $date\n" +
    "면적 : $area  m2\n"

}