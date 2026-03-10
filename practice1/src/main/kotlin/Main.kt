const val PI=3.14
fun main(){
    println(PI)
    var userName: String ="Shubhi"
    userName="Rishabh"

    var age:Int=21
    println(age)

    var age2:Float=24.4f
    println(age2)

    var result:Boolean= true;
    println(result)

    var name="Shubhi"
    var newAge=20
    val marks=66.7
    println("$name, $newAge, $marks")



    val userName2:String="Aditya"
    //val are immutable
    println("Hello, $userName!")
    println("Hello, $userName2!")
    //println(userName)

    lateinit var address:String
    address="Delhi"
    println(address)
    //lateinit use pnly with non primitive data type

    //non null variable
    var city:String?="Mumbai"
    println(city?.length)

    var city2:String?=null
    val length=city2?.length ?:0
    println(length)

    //const val PI=3.14
    //println(PI)
    // const val CANNOT be written inside main() or a normal class function.
    //✔ It must be declared:
    //at top level, or
    //inside an object, or
    //inside a companion object


}