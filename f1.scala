object DiskAreaCalculator {
  def calculate(radius: Double): Double = 
    (4.0 / 3.0) * math.Pi* math.pow(radius, 3)

  def main(args: Array[String]): Unit = {
    val radius = 5
    val area = calculateArea(radius)
    println(s"The area of a disk with radius $radius is $area")
  }
}
