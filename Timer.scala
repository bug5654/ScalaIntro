object Timer {
	def oncePerSecond(callback: () => Unit) {
		var i=0
		while(i<10) { 
			callback()			//call passed function
			Thread sleep 1000	//Thread.sleep(1000) equivalent
			i+=1
		}
	}
	def timeFiles() {
		println("another second lost")
	}

	def main(args: Array[String]) {
		oncePerSecond(timeFiles)
	}
}