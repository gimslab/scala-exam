import org.scalatest.FlatSpec
import scala.collection.mutable.Stack
import org.scalatest._

class FirstTestSpec extends FlatSpec {
  "A Stack" should "pop values in last-in-first-out order" in{
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }
  
  it should "throw xxx" in {
    val emptyStack = new Stack[String]
    intercept[NoSuchElementException] {
      emptyStack.pop()
    }
  }
  
  it should "must not be null" in {
    val st = new Stack[Int]
    assert(st != null)
  }

}