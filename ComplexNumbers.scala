class Complex(real: Double, complex: Double) {
	def re() = real
	def j() = complex
}

object ComplexNumbers {
	def main(args: Array[String]) {
		val c = new Complex(1.2, 3.4)
		println("imaginary part: " + c.j()) 
	}
}