/**
 * 
 */
package com.example.array;

/**
 * @author Nikita Borhade
 *
 */
public class ArrayDeclaration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = {1,3,5,7,8,9,11,13,15,17,18};
		
		System.out.println("Array elements are: " );
		
		for(int i=0; i < a.length ; i++){
			System.out.println(a[i]);
		}
	}

}
