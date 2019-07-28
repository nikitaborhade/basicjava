/**
 * 
 */
package com.example.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Nikita Borhade
 *
 */
public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numberList = new LinkedList<Integer>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(5);
		numberList.add(7);
		
		for(Integer value : numberList){
			if(value == 5){
				numberList.remove(value);
			}
			System.out.println("Numbers : " +value);
		}
		
		Integer j = numberList.size();
		System.out.println("Size of List :" +j);
		
		for(int i=0; i<numberList.size(); i++){
			System.out.println("Numbers : " +numberList.get(i));
		}
		
		
		
	}

}
