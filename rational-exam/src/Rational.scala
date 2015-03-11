class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val number = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1);

  override def toString() = number + "/" + denom

  def +(that: Rational): Rational =
    new Rational(number * that.denom + denom * that.number, denom * that.denom)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

object Main {
  def main(args: Array[String]): Unit = {
    val r1 = new Rational(1, 2)
    val r2 = new Rational(2, 3)
    val r3 = r1 + r2
    println(r1)
    println(r2)
    println(r3);
  }
}