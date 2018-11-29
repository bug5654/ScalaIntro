class Complex(real: Double, complex: Double) {
	// def re() = real
	// def j() = complex
	def re = real
	def j = complex
	override def toString() = "" + (if (re != 0) {re+" "} else "") + (if (j < 0 || re ==0) "" else " + ") + j + "j" 
	//would create sign() function to align negatives properly but simple example
}

object ComplexNumbers {
	def main(args: Array[String]) {
		val c = new Complex(1.2, 3.4)
		val d = new Complex(0,2)
		val f = new Complex(3,-4)

		// println("imaginary part: " + c.j()) 
		// println("imaginary part: " + (c j) )
		println("complex number:  " + c)
		println("complex number:  " + d)
		println("complex number:  " + f)

	}
}