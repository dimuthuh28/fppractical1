object DiskAreaCalculator {
  def calculateArea(radius: Double): Double = {
    val pi = math.Pi
    pi * math.pow(radius, 2)
  }

  def main(args: Array[String]): Unit = {
    val radius = 5
    val area = calculateArea(radius)
    println(s"The area of a disk with radius $radius is $area")
  }
}
