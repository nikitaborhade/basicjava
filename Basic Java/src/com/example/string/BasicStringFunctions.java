/**
 * 
 */
package com.example.string;

/**
 * @author Nikita Borhade
 *
 */
public class BasicStringFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "Nikita ";
		
		System.out.println("Name is: "+name);
		
		int length = name.length();
		
		System.out.println("Length of String:" +length);
		
		char character = name.charAt(3);
		
		System.out.println("Character at index: "+character);
		
		
		String substring = name.substring(0, 4);
		
		System.out.println("Substring: "+substring);
		
		
		String trimString = name.trim();
		System.out.println("trimString: "+trimString);
		
		
		String upperCaseString = name.toUpperCase();
		System.out.println("upperCaseString: " +upperCaseString);
		
		
		
		
		
	}

}
