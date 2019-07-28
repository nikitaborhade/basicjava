/**
 * 
 */
package com.example.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Nikita Borhade
 *
 */
public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Integer> numberSet = new HashSet<Integer>();
		
		numberSet.add(10);
		numberSet.add(20);
		numberSet.add(20);
		numberSet.add(30);
		numberSet.add(40);
		numberSet.add(10);
		
		for(Integer value: numberSet){ 
			System.out.println("value:" +value);
		}
		
	}

}
