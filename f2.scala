object Converter {
  def calculate(celsius: Double): Double = {
    celsius * 1.8 + 32.00}
  

  def main(args: Array[String]): Unit = {
    val celsius = 35
    val tempF = calculate(celsius)
    println(s"The temperature in Fahrenheit is $tempF")
  }
}
