class MultiTable {
  def getString(): String = {
    val str = 
    for (n <- 1 to 10) yield makeRow(n);
    str;
  }

  def makeRow(n: Int): String = {
    val row =
      for (h <- 1 to 10) yield {
        n * h + " "
      }
    row + "\n"
  }
}

object MultiTable {
  def main(args: Array[String]): Unit = {
    println(new MultiTable().getString())
  }
}