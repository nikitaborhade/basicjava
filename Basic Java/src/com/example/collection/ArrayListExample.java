/**
 * 
 */
package com.example.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nikita Borhade
 *
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>();
		/*
		 * cityList.add("Pune"); cityList.add("Mumbai");
		 * cityList.add("Solapur"); cityList.add("Nashik");
		 * cityList.add("Nagpur"); cityList.add("Satara");
		 */

		for (String value : cityList) {
			System.out.println("City Name: " + value);
		}

		List<Integer> numberList = new ArrayList<Integer>();
		
		if(cityList.isEmpty()){
			System.out.println("List is empty");
		}
	}

}
