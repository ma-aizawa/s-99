object P04 {
  def length(list: List[Int]): Int = {
    list match {
      case x :: xs => 1 + length(xs)
      case Nil => 0
    }
  }

  def main(args: Array[String]): Unit = {
    val result = length(List(1, 1, 2, 3, 5, 8))
    println(result)
    println(result == 6)
  }
}
