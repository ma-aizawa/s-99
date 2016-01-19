object P05 {
  def reverse(list: List[Int]): List[Int] = {
    list match {
      case x :: xs => reverse(xs) ::: List(x)
      case Nil => Nil
    }
  }

  def main(args: Array[String]): Unit = {
    println(reverse(List(1, 1, 2, 3, 5, 8)))
  }
}
