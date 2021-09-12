package funcProgAss1

object abc {

  //DEMONSTRATION
  object Demonstration {
    def firstElement1Exception(l: List[Int]): Int = l.head

    def firstElement1Null(l: List[Int]): Int = if (l.size > 0) l.head else null.asInstanceOf[Int]

    def firstElement1OrDefault(l: List[Int], default: Int): Int = if (l.size > 0) l.head else default

    def firstOptionalElement(l: List[Int]): Option[Int] = if (l.size > 0) Some(l.head) else None

    def demonstrate(): Unit = {
      println("EFFECTS : DEMONSTATION - HOW TO HANDLE MISSING VALUE")
      //////////////////////TRY
      println("1) first element of empty list with try")
      try {
        val firstElement = firstElement1Exception(List()) //are you forced to check if exception?
        println(s"  --  first element is $firstElement")
      } catch {
        case e: Exception => println("  --  there is no first element")
      }

      //////////////////////NULL
      println("2) first element of empty list with null")
      val firstElementOrNull = firstElement1Null(List()) // are you forced to check if null?
      if (firstElementOrNull != null.asInstanceOf[Int])
        println(s"  --  first element is $firstElementOrNull")
      else
        println("  --  there is no first element")

      //////////////////////DEFAULT
      println("3) first element of empty list with default")
      val firstElementOrDefault = firstElement1OrDefault(List(), -1) // what if there is no intuitive default?
      println(s"  --  first element is $firstElementOrDefault ...but maybe list was really empty, we don't know")

      //////////////////////OPTION
      println("4) first element of empty list with option")
      val optionalFirstElement: Option[Int] = firstOptionalElement(List())

      //not the best way of Option usage, we will learn better approach in the next exercise
      if (optionalFirstElement.isDefined)
        println(s"  --  first element is ${optionalFirstElement.get}")
      else
        println("  --  there is no first element")
    }
  }

  def main(args: Array[String]) {
    Demonstration.demonstrate()
  }
}

