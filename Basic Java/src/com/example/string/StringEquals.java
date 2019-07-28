

package com.example.string;

/**
 * @author Nikita Borhade
 *
 */
public class StringEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String name1 = "Amol";
		
		String name2 = "amol";
		
		String name3 = new String("amol");
		
		if(name1.equals(name2))
		{
			System.out.println("name1 and name2 are equal");
		} else
		{
			System.out.println("name1 and name2 are unequal");
		}
		
		if(name1.equals(name3))
		{
			System.out.println("name1 and name3 are equal");
		} else
		{
			System.out.println("name1 and name3 are unequal");
		}
		
		if(name2.equals(name3))
		{
			System.out.println("name2 and name3 are equal");
		} else
		{
			System.out.println("name2 and name3 are unequal");
		}
		
		if(name1 == name2)
		{
			System.out.println("name1 and name2 are equal by == ");
		}
		
	}

}
