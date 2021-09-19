package org.techM.app;

public class Expressions
{
	public static void main(String[] args)
	{
	  //expression=operands &operators
	  //operands = variables,values,numbers,quantity
	  //operators = +,-,/,*,%
	  //operand as variable
	  int a=10;
	  //for adding
	    //a = a + 1;
	 //for subtracting
	    //a= a - 1;
	  //for multiplying
	     //a= a * 2;
	  //for division
	     //a= a / 5;
	  // for modulus
	     //a= a % 2;
	 // System.out.println(a);
	  
	  //example-2
	    
	  int secondsInDay=0;
	  int hoursInDay=24;
	  int minutesInHour=60;
	  int secondsInMinute=60;
	  int daysInWeek=7;
	  
	  secondsInDay=secondsInMinute*minutesInHour*hoursInDay;
	  
	  System.out.println("the number of seconds in a day is " +secondsInDay);
	  
	  
	}
}
