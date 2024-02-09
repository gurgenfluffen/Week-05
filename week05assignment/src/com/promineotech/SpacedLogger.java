package com.promineotech;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		String spaceString = "";
		
		for ( int i = 0; i < log.length(); i++ ) {
            spaceString += log.charAt(i) + " ";
        }
        
        System.out.println(spaceString);
		
		
	}

	@Override
	public void error(String error) {
		
String spaceString = "";
		
		for ( int i = 0; i < error.length(); i++ ) {
            spaceString += error.charAt(i) + " ";
        }
        
        System.out.println("ERROR: " + spaceString);
		
	}

}
