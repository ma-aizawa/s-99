object P10 {
  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    list match {
      case List(x) => List((1, x))
      case x :: y :: ys if x != y => (1, x) :: encode(y :: ys)
      case x :: y :: ys if x == y =>
        encode(y :: ys) match {
          case (a, b) :: bs => (a + 1, b) :: bs
          case _ => List()
        }
    }
  }

  def main(args: Array[String]): Unit = {
    val result = encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    println(result)
    println(result == List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  }
}
