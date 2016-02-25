object P10 {
  def encode(list: List[Symbol]): List[Any] = {
    list match {
      case List(x) => List(x)
      case x :: y :: ys if x != y => x :: encode(y :: ys)
      case x :: y :: ys if x == y =>
        encode(y :: ys) match {
          case (a: Int, b) :: bs => (a + 1, b) :: bs
          case a :: as => (2, a) :: as
          case _ => List()
        }
    }
  }

  def main(args: Array[String]): Unit = {
    val result = encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    println(result)
    println(result == List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e)))
  }
}
