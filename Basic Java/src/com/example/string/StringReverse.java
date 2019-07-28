package com.example.string;

import java.util.Arrays;

/**
 * @author Nikita Borhade
 *
 */
public class StringReverse {

	public static void main(String[] args) {

		String name = "Nikita";
		
		System.out.println("Name is: " +name);
		
		int stringLength = name.length();
		
		System.out.println("String Length: " +stringLength);
		
		char character = name.charAt(3);
		
		System.out.println("Charater at index: " +character);
		
		String s1 = "nikita";
		s1 = s1.concat("Borhade");
		
		System.out.println("concate = " +s1);
		
		String reverse  =  new StringBuffer(s1).reverse().toString();
		System.out.println("reverse is = " +reverse);
		
		
		
		
	}

}




