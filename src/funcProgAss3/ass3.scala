package funcProgAss3

object ass3 extends App {
  // ----------- Ex 1 ------------------
  val a: Int = 3
  val b: Int = 2
  val c: Int = 4
  val lst = List.range(-3, 3)

  def Ex_1(g : Int => Int, h: Int => Int, i : Int => Int, j: Int => Int) = (x: Int) => g(h(i(j(x))))

  def y1 = Ex_1(_ + c , _ * b, _ * a , scala.math.pow(_,2).toInt)
  val finallist = lst.map(y1(_))
  println(finallist)

  // --------------- Ex 2 --------------------

  val ziplist = lst.zip(finallist).zipWithIndex
  println(ziplist)

  val mean = ziplist.map(data => data._1._2)
  val ans = mean.reduce(_ + _) / mean.size
  println(ans)

  // ---------------- Ex 3 ------------------
  val vector = List(List(8,2),List(3,2),List(5,2),List(6,2))
  val reducelst = vector.map(_.reduce(_ - _))
  val square = reducelst.map(scala.math.pow(_,2)).reduce(_ + _).toInt
  val Ex3_ans = scala.math.sqrt(square)
  println(Ex3_ans)

  // -------------- shallow and deep copy --------------
  case class Person(var firstname: String, lastname: String)

  val p1 = Person("abc", "def")
  val p2 = p1.copy()
  p1.firstname = "anusha"
  println(p2)            // deep copy

  val p3 = Person("anusha", "khalil")
  val p4 = p1.copy(p3.firstname, "Anusha")
  println(p4)          // shallow copy


  // -------------- FSM --------------------
  object companion extends Enumeration{
    val init = Value("Start")
    val up = Value("Up")
    val down = Value("Down")
    val last = Value("Reset")
  }

  import companion._
  class companion {
    var state = companion.init.toString
    var i : Int = 4
    while(i != 0)
      state match {
        case "Start" => {
            state = companion.up.toString
          println("start case",state)
          i -= 1
        }
        case "Up" => {
            state = companion.down.toString
          println("up case",state)
          i -= 1
        }
        case "Down" => {
            state = companion.last.toString
          println("down case",state)
          i -= 1
        }
        case "Reset" => {
          state = companion.init.toString
          println("reset case",state)
          i -= 1
        }
      }
    }

  val obj = new companion()

//  ------------------ Addition of string ----------------------
  def func(a1 : Any, a2 : Any) = {
    val imp = a1.toString + a2.toString
    imp
}
 println(func(1,"anusha"))

  // ---------------- Apply function --------------------------

  def f(lst: List[Int]) = { val applyans = lst.reduce(_ + _)
  applyans }

  val lstans = List(1,2,3,4,5)
  println(f(lstans))

  // ------------- Chisel Ex ---------------
  // in chisel repo
}

