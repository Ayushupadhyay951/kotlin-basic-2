import kotlin.math.pow
class circle(
 val radius:Int
){
    fun circumference()=2*Math.PI*radius
    fun area() =Math.PI*radius
}
class volumeofsphere(
    val radius:Int
){
    val base=radius
    val exponant=3
   fun Volumeofsphere()=(4/3)*Math.PI*radius*radius*radius
//    fun Volumeofsphere()= (4/3)*Math.PI*base.pow(Exponent)
}
fun main(){
    print("Enter the radius of circle:")
    val r=readln().toInt()
    val c1=circle(r)
    println("circle with radius ${c1.radius}")
    println("Area will be ${c1.area()}")
    println("circumference will be ${c1.circumference()}")
    val v1=volumeofsphere(r)
    println("volume of sphere ${v1.Volumeofsphere()}")
}