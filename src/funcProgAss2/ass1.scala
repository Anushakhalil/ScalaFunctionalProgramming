package funcProgAss2

import scala.util.Random

object ass1 {

  def Ex_1 = {

    val a1: Array[String] = new Array[String](3)
    a1(0) = "anusha";
    a1(1) = "hafsa";
    a1(2) = "zoha"

    val a2= Array("Anusha", "hafsa", "zoha")

    val a3= Array.range(0,3)
//    a1.toSeq
//    a2.toSeq
    a3.toSeq
  }

  import scala.collection.mutable.Set
  import scala.collection.mutable.Map

  def Ex_2 = {
    val setval :Set[String] = Set("Plain Donut","Strawberry Donut","Chocolate Donut")
    val mapval : Map[Int,String] = Map(1 -> "sbc", 2 -> "fdd")

//    setval
    mapval
  }

  def Ex_3(str: Option[String]) =
    str match{

    case Some(value) => 2
    case _ => 0
  }


  def Ex4_1(x: Int => Char, y: Int) = x(y)
  def Ex4_2[Char](x: Int) = x.toChar

// ----------------- Task1 ----------------------------
  def generateR(end : Int, start : Int) = {
    val lst = List.fill(15)(util.Random.nextInt(end - start))
    iterate(lst)
  }

  def isPrime(n: Int): Boolean = {
    !((2 until n - 1) exists (n % _ == 0))
  }

//    def check(n: Int, i: Int, ans: Boolean): Boolean =
//      if ((n-1) == i || !ans) ans
//      else {
//        if (n == 2) check(n, n, true)
//        else check(n, i + 1, if(n % i != 0) true else false)
//      }
//    check(13, 2, false)
//      }

  def iterate(lst : List[Int]) = {
    val primeiterator = lst.filter(isPrime).sortWith(_ < _).iterator
    primeiterator
  }

// ---------------------- Task 3 ------------------------------
  def task3 = {
    val array = Array(1, 2, 3).zip(Array(3, 4, 5)).map { case (a, b) => a + b } // Task3
    array.toSeq
  }
// ---------------------- Task 2 -------------------------------
    def CharArray(start: Int): List[Char] = { // Task2
      @annotation.tailrec
      def dofunc(start: Int, value: String): List[Char] =
        if (start == 123) value.toList
        else dofunc(start + 1, value + start.toChar)

      dofunc(start, "")
    }

  // ------------------------- Task 4 -------------------------------------
    def Task4_1(array: Array[Int], n: Int, count: Int): Int = {

      if (n == (array.length) - 1) count
      else {
        if (array(n) % 2 == 0) count + Task4_1(array, n + 1, count + 1)
        else count + Task4_1(array, n + 1, count + 0)
      }
    }

    def Task4_2(array: Array[Int]): Int = {
      array.count(x => x % 2 == 0)
    }

  // ----------------------- Task 5 ----------------------------------------

      def buildMap[A, B](data: Seq[A], f: A => B): Map[B,A]= {
        var mapvalue = Map[B,A]()

        def func(n: Int) : Map[B,A] =
          if ((n - 1) == (data.size) - 1) mapvalue
          else {
            mapvalue += (f(data(n)) -> data(n))
            func(n+1)
          }
        func(0)
      }

    def main(args: Array[String]): Unit = {

     println(Ex_1)
     println(Ex_2)

     val maps = Map(1 -> "ABC")
     println(Ex_3(maps.get(1)))

     println(Ex4_1(Ex4_2, 122))

     println(CharArray(97))
     println(task3)
     println(Task4_1(Array(2, 3, 6), 0, 0))
     println(Task4_2(Array(2, 3, 6)))

// ------------ Task1 ----------------
     val lst = List(1,2,3,4,5,6,7,8,9)
     val iterateVal = generateR(500,50)
     val mapval = scala.collection.mutable.Map[Int,Int]()

     var i = 0
     while (iterateVal.hasNext) {
       val iterval = iterateVal.next()
       mapval += (i -> iterval)
       i += 1
     }
     println(mapval)

// ------------ Task5 ----------------

     val list = Array(97,98,99,100)
     def func(A: Int): Char = A.toChar
     println(buildMap(list,func))

    }
  }

