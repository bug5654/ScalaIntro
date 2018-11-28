object TimerAnonymous {
	def oncePerSecond(callback: () => Unit) {
		while (true) { 
			callback(); 
			Thread sleep 1000 
		} 
	}
	def main(args: Array[String]) { 
		oncePerSecond( () =>		//defining an anonymous function instead of having another member method
			println("time flies like an arrow...") 
		) 
	}
}