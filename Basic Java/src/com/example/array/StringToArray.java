/**
 * 
 */
package com.example.array;

/**
 * @author Nikita Borhade
 *
 */
public class StringToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "Borhade";
		
		System.out.println("Name is: " +name);
		
		char ch[] = name.toCharArray();
		
		System.out.println("Characters in name are: ");
		
		for(int i=0; i<ch.length; i++){
			System.out.println(ch[i]);
		}
		
	}

}
