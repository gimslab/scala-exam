package ch15

object PatternMatchWithTypedPatterns {

  def generalSize(x: Any) = x match {
    case s: String    => s.length
    case m: Map[_, _] => m.size
    case _            => -1
  }

  def main(args: Array[String]): Unit = {
    printSize("abc")
    printSize(Map(1->'a', 2->'b'))
    printSize(3)
  }

  def printSize(a: Any) = {
    println("size of " + a + " is " + generalSize(a));
  }

}