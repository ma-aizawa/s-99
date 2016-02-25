object P09 {
  def pack(list: List[Symbol]): List[List[Symbol]] = {
    list match {
      case x :: xs => merge(List(x), xs)
      case _ => List()
    }
  }

  def merge(matchingList: List[Symbol], list: List[Symbol]): List[List[Symbol]] = {
    list match {
      case x :: xs if matchingList.head == x => merge(x :: matchingList, xs)
      case x :: xs if matchingList.head != x => matchingList :: merge(List(x), xs)
      case List() => List(matchingList)
    }
  }

  def main(args: Array[String]): Unit = {
    val result = pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    println(result)
    println(result == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }
}
