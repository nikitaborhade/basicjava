/**
 * 
 */
package com.example.array;

/**
 * @author Nikita Borhade
 *
 */
public class reversearray 
{
	public static void main(String[] args) 
	{
        int a[]={10,20,30,40,50};
       /* int i=0;
        int j=i-1;
        int temp=0;
        
        while(i<j)
        {
        	
        	temp = a[i];
        	a[i] = a[j];
        	a[j] = temp;
        	i++;
        	j--;
        	
        }*/
        //System.out.println("reverse of array is :" +a[i] );
        
        for(int j=0;j<a.length;j++)
        {
        	System.out.println(a[j] + " " );
        }
        
        for(int i=0; i<a.length; i++)
        {
        	
        			
        			int temp = a[i];
        			a[i] = a[a.length-i-1];
        			a[a.length-i-1] = temp;
        			System.out.println(a[i]);
        		
        	}
        
        
        
	}

}
