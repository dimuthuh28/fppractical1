object VolumeCalculator {

  def calculate(radius: Double): Double = {
    val pi = math.Pi
    (4.0 / 3.0) * pi * math.pow(radius, 3)
  }

  def main(args: Array[String]): Unit = {
    val radius = 5.0
    val volume = calculate(radius)
    println(s"Volume of this sphere is $volume.")
  }
}
