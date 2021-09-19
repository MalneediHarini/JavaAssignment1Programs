package org.techM.app;

import java.util.ArrayList;
import java.util.List;

public class Lists 
{
	public static void main(String[]args)
	  {
		//Creating a List  
		  List<String> list=new ArrayList<String>();  
		  //Adding elements in the List  
		  list.add("Jasmine");  
		  list.add("Rose");  
		  list.add("Sunflower");  
		  list.add("Lilly");  
		  //Iterating the List element using for-each loop  
		  for(String flowers:list)  
		   System.out.println(flowers); 
	  }
}
