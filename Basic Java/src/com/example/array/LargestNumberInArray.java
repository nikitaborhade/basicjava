/**
 * 
 */
package com.example.array;

/**
 * @author Nikita Borhade
 *
 */
public class LargestNumberInArray 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		int a[] = {23,45,12,46,78,21,42,57,98,22,34};
		int number = 0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					number = a[i];
				}
			}
		}
		
		System.out.println("Largest Number is: " +number);
		
		int small = a[0];
				
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<small)
			{
				small = a[i];
			}
			
		}
		
		
		System.out.println("Smallest Number is: " + small);
	}

}
