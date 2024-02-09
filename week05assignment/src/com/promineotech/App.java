package com.promineotech;



public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		
		asteriskLogger.log("Name");
		asteriskLogger.error("Josh");
		
		spacedLogger.log("Betty!");
		spacedLogger.error("Wow");
		

	}

}
