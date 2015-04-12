package ch15

object Tuple {

  def tupleDemo(expr: Any) =
    expr match {
      case (a, b, c) => println("matched " + a + b + c)
      case _         =>
    }

  def main(args: Array[String]): Unit = {
    tupleDemo(("a ", 3, "-tuple"))
  }

}