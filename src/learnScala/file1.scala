package learnScala

object file1 extends App {
  def factorial(n: Int) : Int = {
    if (n != 0) n * factorial(n - 1) else 1
  }
  def fibonacci(n: Int) : Int = {
    if (n <=1 ) n
    else {
      fibonacci(n - 1) + fibonacci(n - 2)
    }
    }
  class Novel(val name: String,val year: Int,val author :Writes ){
    def authorAge(): Unit ={
      println(2021-this.author.year)
    }
    def isWrittenBy(author : String): Unit ={
      if (this.author.name == author){
        println("Yes")
      } else println("No")
    }
  }
  class Writes(val name : String, val year: Int)

  val obj = new Writes("anusha",2000)
  val obj2 = new Novel("Abc", 2010, obj)
  obj2.authorAge()
  obj2.isWrittenBy("Anusha")
  println(factorial(3))
  println(fibonacci(10))
}