package com.berkeley.cs61b.homework.one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nuke2 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader keyboard;
	    String inputLine;
	    StringBuilder inputLineBuilder;

	    keyboard = new BufferedReader(new InputStreamReader(System.in));
	    
	    inputLine = keyboard.readLine();
	    
	    inputLineBuilder = new StringBuilder(inputLine);
	    
	    // remove the 2nd character
	    for(int i = 0; i<inputLine.length(); i++) {
	    	if(i == 1) {
	    		continue;
	    	} else {
	    		System.out.print(inputLine.charAt(i));
	    	}
	    }
	    
	    // alternate method
	    System.out.println(inputLineBuilder.deleteCharAt(1));
	    
	}

}
