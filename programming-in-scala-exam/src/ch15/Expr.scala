package ch15

abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object Expr {

  def main(args: Array[String]): Unit = {
    val v = Var("x")
    println(v)

    val op = BinOp("+", Number(1), v);
    println(op)

    println(v.name)
    println(op.left)

    val eq = op.right == Var("x")
    println(eq)

    val n = Number(3)
    val expr = UnOp("-", UnOp("-", n))
    println(expr)
    println(simplifyTop(expr))
    
  }

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case _                       => expr
  }
}