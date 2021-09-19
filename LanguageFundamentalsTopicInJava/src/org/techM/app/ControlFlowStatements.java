package org.techM.app;

public class ControlFlowStatements
{
	public static void main(String[]args)
	  {
		  //Conditional Statements
		  //if else statements
		  int age=22;
			if(age>=18)
			{
			System.out.println("You are eligible for voting...");
			}
			else
			{
				System.out.println("You are not eligible for voting...");
			}
			
		  //else if statements
			int marks= 80;
			if((marks>= 90) && (marks<=100))
			{
			System.out.println(" you got a 1st rank");
			}
			else if((marks>= 70) && (marks<=89))
			{
			System.out.println(" you got a 2nd rank");
			}
			else if((marks>= 69) && (marks<=69))
			{
			System.out.println(" you got a 1st class");
			}
			else if((marks>=59) && (marks<=50))
			{
		    System.out.println(" you got a 2nd class");
			}
			else if((marks>=49) && (marks<=35))
			{
			System.out.println(" you can just pass");
			}
			else if((marks>=34) && (marks<=0))
			{
				System.out.println("you failed");
			}
			else
			{
			System.out.println("Invalid marks");
			}
		// switch  case statements
			
			    int number = 20;
			    String size;

			    // switch statement to check size
			    switch (number) {

			      case 29:
			        size = "Small";
			        break;

			      case 42:
			        size = "Medium";
			        break;

			      case 44:
			        size = "Large";
			        break;

			      case 48:
			        size = "Extra Large";
			        break;
			      
			      default:
			        size = "Unknown";
			        break;

			    }
			    System.out.println("Size: " + size);
			    
		// for loop statements
			//decrementing
			for(int c=5;c>=1;c--)
			{
		      System.out.println("Good Evening");
			}
			
			// incrementing
			int count=0;
			for(int i=5;i<=20;i++)
			{
				if(i%2==0)
				{
					count++;
				}
			}
			System.out.println("Total even numbers between 5 to 20 is " +count);
			
		//while loop statement
			// declare variables
		    int i = 1, n = 5;

		    // while loop from 1 to 5
		    while(i <= n) {
		      System.out.println(i);
		      i++;
		    }
		
		  // do while loop statement
		    int a = 1, b = 3;

		      // do...while loop from 1 to 5
		    do {
		      System.out.println(a);
		      a++;
		    } while(a <= b);
		    
		  // break statements
		     // for loop
	        for (int j = 1; j <= 10; ++j) 
	        {

	            // if the value of i is 5 the loop terminates  
	            if (j == 5) 
	            {
	                break;
	            }      
	            System.out.println(j);
	        }
	  }
}
