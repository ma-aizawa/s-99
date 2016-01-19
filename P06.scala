object P06 {
  def isPalindrome(list: List[Int]): Boolean = {
    list == list.reverse
  }

  def main(args: Array[String]): Unit = {
    val result = isPalindrome(List(1, 2, 3, 2, 1))
    println(result)
    println(result == true)
  }
}
