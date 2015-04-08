class MultiTable {
  def getString(): String = {
    val rows = for ( n <- 1 to 10 ) yield {
      makeRow(n)
    }
    rows.mkString("\n");
  }

  def makeRow(n: Int): String = {
    val cols = for (h <- 1 to 10) yield {
        val result = n * h + " "
        val padding = " " * (4 - result.length)
        padding + result
      }
    cols.mkString("|")
  }
}

object MultiTable {
  def main(args: Array[String]): Unit = {
    println(new MultiTable().getString())
  }
}