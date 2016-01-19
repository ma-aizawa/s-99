object P02 {
  def penultimate(list: List[Int]): Int = {
    list match {
      case List(x, _) => x
      case x :: xs => penultimate(xs)
    }
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(penultimate(list) == 5)
  }
}
