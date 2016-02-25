object P09 {
  def pack(list: List[Symbol]): List[List[Symbol]] = {
    list match {
      case x :: y :: ys if x != y => List(x) :: pack(y :: ys)
      case x :: y :: ys if x == y =>
        pack(y :: ys) match {
          case a :: as => (x :: a) :: as
          case _ => List()
        }
      case _ => List(list)
    }
  }

  def main(args: Array[String]): Unit = {
    val result = pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    println(result)
    println(result == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }
}
