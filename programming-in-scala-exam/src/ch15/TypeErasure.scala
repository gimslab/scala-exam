package ch15

object TypeErasure {
  def isIntIntMap(x: Any) = x match {
    case m: Map[Int, Int] => true
    case _ => false
  }
  
  def isStringArray(x: Any) = x match {
    case a: Array[String] => "yes"
    case _ => "no"
  }
  
  def main(args: Array[String]): Unit = {
    println(isIntIntMap(3))
    
    val m1 = Map(1->1, 2->4, 3->6)
    println(isIntIntMap(m1))
    
    val m2 = Map("a"->3, "b"->11) // ==> true??? type erased when runtine
    println(isIntIntMap(m2))
    
    println(isStringArray(Array(1, 2)))
    println(isStringArray(Array("a", "b")))
  }
}