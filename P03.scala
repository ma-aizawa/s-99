object P03 {
  def nth(n: Int, list: List[Int]): Int = {
    (n, list) match {
      case (0, List(x, _*)) => x
      case (n, _ :: xs) => nth(n - 1, xs)
    }
  }

  def main(args: Array[String]): Unit = {
    println(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }
}
