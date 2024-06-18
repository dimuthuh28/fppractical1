object VolumeCalculator {

  def calculate(radius: Double): Double = {

    (4.0 / 3.0) *math.Pi * math.pow(radius, 3)}


  def main(args: Array[String]): Unit = {
    val radius = 5.0
    val volume = calculate(radius)
    println(s"Volume of this sphere is $volume.")
  }
}
