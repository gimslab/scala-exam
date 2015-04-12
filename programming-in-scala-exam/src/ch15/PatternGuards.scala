package ch15

object PatternGuards {

  def simplifyAdd(e: Expr) = e match {
    case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
    case _                          => e
  }

  def main(args: Array[String]): Unit = {
    println(simplifyAdd(BinOp("+", Number(2), Number(2))))
    println(simplifyAdd(BinOp("+", Number(3), Number(2))))
  }
}