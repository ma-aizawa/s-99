object P01 {
  def last(list: List[Int]): Int = {
    list match {
      case List(x) => x
      case _ :: xs => last(xs)
    }
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(last(list) == 8)
  }
}
