import scala.actors.Actor

case object Hop
case object Stop

case class Bunny(id : Int) extends Actor {
  this ! Hop
  start()
  def act(){
    loop {
      react {
        case Hop =>
          println(this + " " )
          this ! Hop
          Thread.sleep(500)
        case Stop =>
          println("Stopping "+this)
          exit()
      }
    }
  }
}
