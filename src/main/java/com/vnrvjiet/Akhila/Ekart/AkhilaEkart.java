package com.vnrvjiet.Akhila.Ekart;
import java.util.*;
/**
 * Hello world!
 *
 */
class MainPage
{
	MainPage()
	{
		 System.out.println("Welcome!!");
	     System.out.println("1.Electronics    2.Bags");
	     System.out.println("Enter 1 for Electronics  or 2 for Bags");
	     Scanner choiceObject= new Scanner(System.in); 
	         
	     	int choice =choiceObject.nextInt(); 
	
				if(choice==1)
				{
				  Electronics electronicsObject= new Electronics();
				  
				}
			   else if(choice==2)
				{
					Bags bagesObject=new Bags();
				}
			    else
				{
				    System.out.println("Enter valid choice!!");
				}
	}
}
public class AkhilaEkart 
{
	
	 

    public static void main( String[] args)
    {
    	try {
       MainPage mainPageObject=new MainPage();
    	}
        catch(Exception e) 
	     {
			System.out.println("Entered choice is Not an Integer");
			System.out.println("Re-Enter correct choice");
			 MainPage mainPageObject=new MainPage();

         }
    	
        
    }
}
