object BookCostCalculator {
  def main(args: Array[String]): Unit = {
    val coverPrice = 24.95
    val discountRate = 0.40
    val discountedPrice = coverPrice * (1 - discountRate)
    
    val numberOfCopies = 60
    val shippingFirst50 = 3.0
    val shippingAdditional = 0.75
    val additionalCopies = numberOfCopies - 50
    
    val totalShippingCost = if (additionalCopies > 0) {
      shippingFirst50 + (additionalCopies * shippingAdditional)
    } else {
      shippingFirst50
    }
    
    val totalBookCost = discountedPrice * numberOfCopies
    val totalCost = totalBookCost + totalShippingCost
    
    println(f"The total wholesale cost for $numberOfCopies copies is Rs. $totalCost%.2f")
  }
}
