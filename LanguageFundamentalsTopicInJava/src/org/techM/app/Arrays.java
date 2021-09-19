package org.techM.app;

import java.util.Scanner;

public class Arrays 
{
	 public static void main(String[]args)
	  {
		// declares an Array of integers.
	      int[] arr;
	          
	      // allocating memory for 5 integers.
	      arr = new int[5];
	          
	      // initialize the first elements of the array
	      arr[0] = 100;
	      arr[1] = 260;
	      arr[2] = 320;
	      arr[3] = 405;
	      arr[4] = 500;
	          
	      // accessing the elements of the specified array
	      for (int i = 0; i < arr.length; i++)
	      {
	         System.out.println("Element at index " + i + " : "+ arr[i]);  
	      }
	      
	      
	      //another example for arrays
	      // arrays using for and for each loop
		    Scanner scan=new Scanner(System.in);
			System.out.println("Enter the array size");
			int size=scan.nextInt();
			int[] a1=new int[size];
			for(int i=0;i<=a1.length-1;i++)
			{
				System.out.print("Enter value for a1["+i+"] ");
				a1[i]=scan.nextInt();
				System.out.println();
			}
			for(int j:a1)
			{
			
				System.out.println("Array Elements are " +j+" ");
				
			}
	  }
}
