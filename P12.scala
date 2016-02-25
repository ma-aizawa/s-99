object P12 {
  def decode(list: List[(Int, Symbol)]): List[Symbol] = {
    list match {
      case (0, x) :: xs => decode(xs)
      case (n, x) :: xs => (x :: decode(List((n - 1, x)))) ++ decode(xs)
      case _ => List()
    }
  }

  def main(args: Array[String]): Unit = {
    val result = decode(List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    println(result)
    println(result == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
}
