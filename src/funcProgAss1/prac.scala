package funcProgAss1

//object prac {

object prac {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def factorial(n: Int): Int = {
    @annotation.tailrec  // explicitly btane ky liye kay ye tail rec ha
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  def fibonacci(n: Int): Int ={
    @annotation.tailrec
    def dofunc(n: Int, value: Int, limit: Int) : Int =
      if(n == 1) value
      else dofunc(n-1,limit+value, limit=value)
    dofunc(n,1,0)
  }

  def palindrome(n: String): Boolean = {
    @annotation.tailrec
    def func(n: String, Value : String, len : Int) : Boolean =
      if (n == Value && len == 0) true
      else if (n != Value && len == 0) false
      else func(n,Value=Value+n(len-1),len-1)
    func(n,"", 4)
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(factorial(5))
    println(fibonacci(6))
    println(palindrome("abca"))
  }
}
