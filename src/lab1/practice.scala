package lab1

//object practice extends App {
//  //   ---------------------- SCALA TYPE CASTING ------------------------------
//  val f: Float = 34.6F
//  val c: Char = 'c'
//  val ccast = c.asInstanceOf[Int] // asInstanceOf is used for type casting in scala
//  val fcast = f.asInstanceOf[Int]
//  display("Char", c)
//  display("char to int", ccast)
//
//  display("Float", f)
//  display("Float to int", fcast)
//
//  def display[A](y: String, x: A): Unit = { // here [A] will be discussed later in functional programming
//    println(
//      y + " = " + x + " is type of " + x.getClass //getclass return runtime class of an object
//    )
//  }
//}
class Parent{
  val countP = 10
  def display() : Unit = {
    println("Parent counter: " +  countP)
  }
}
class Child extends Parent{
  val countC = 12
  def displayC() : Unit = {
    println("Child counter: " + countC)
  }
}
object practice{    // child class ka object sirf cast hoskta ha parent class se
  // isme object k bad file ka name aegaa
  // ya tw ye krengay extend app wala kam
  def main(args : Array[String]) : Unit = { // args: Array[String] are used for the command line arguments
    var pObject = new Parent() // parent obj
    var cobject = new Child() //child obj
    var castedObject = cobject.asInstanceOf[Parent] // object cast
    pObject.display()
    cobject.display()
    cobject.displayC()
    castedObject.display()
  }
}


