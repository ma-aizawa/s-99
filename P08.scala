object P08 {
  def compress(list: List[Symbol]): List[Symbol] = {
    list match {
      case x :: y :: xs if x == y => compress(x :: xs)
      case x :: y :: xs if x != y => x :: compress(y :: xs)
      case List(x, y) if x == y => List(x)
      case _ => list
    }
  }

  def main(args: Array[String]): Unit = {
    val result = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    println(result)
    println(result == List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
