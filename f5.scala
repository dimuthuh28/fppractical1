object calculatTime {
  def easypaceT(distance: Double): Double = {
    val easypace = 8
    distance * easypace
  }

  def tempoT(distance: Double): Double = {
    val tempo = 7
    distance * tempo
  }

  def main(args: Array[String]): Unit = {
    val totalTime = easypaceT(2) + tempoT(3) + easypaceT(2)
    println(s"Total time for the run is $totalTime")
  }
}
