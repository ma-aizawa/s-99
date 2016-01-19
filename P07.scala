object P07 {
  def flatten(list: List[Any]): List[Any] = {
    list match {
      case x :: xs if x.isInstanceOf[List[Any]] =>
        flatten(x.asInstanceOf[List[Any]]) ::: flatten(xs)
      case x :: xs =>        x :: flatten(xs)
      case _ => list
    }
  }

  def main(args: Array[String]): Unit = {
    val result = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    println(result)
    println(result == List(1, 1, 2, 3, 5, 8))
  }
}
