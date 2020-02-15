package com.vnrvjiet.Akhila.Ekart;

import java.util.Scanner;
class BagsMain{
	BagsMain()
	{
		System.out.println("1.Laptop Bags  2.School Bags  3.Back");
		 System.out.println("Enter 1 for Laptops  or 2 for Mobiles or 3 for Back");
		 Scanner bagObject= new Scanner(System.in); 
		 
		 int bagChoice = bagObject.nextInt();
	
		    if(bagChoice==1)
		    {
		    	LaptopBags LaptopbagType=new LaptopBags();
		    	
		    }
		    else if(bagChoice==2)
		    {
		    	SchoolBags schoolbagType=new SchoolBags();
		    }
		    else if(bagChoice==3)
		    {
		    	MainPage mainPageObject=new MainPage();
		    }
		    else
		    {
		    	System.out.println("Enter valid choice");
		    }
		 
	}
}
public class Bags {

	Bags()
	{
		try {
			BagsMain bagsObject=new BagsMain();
		}
		 catch(Exception e) 
	     {
			System.out.println("Entered choice is Not an Integer");
			System.out.println("Re-Enter correct choice");
			BagsMain bagsObject=new BagsMain();
         }
	
	}
}
