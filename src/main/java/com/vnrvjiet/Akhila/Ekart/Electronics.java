package com.vnrvjiet.Akhila.Ekart;

import java.util.Scanner;
class ElectronicsMain
{
	ElectronicsMain()
	{
	 System.out.println("1.Laptops  2.Mobiles  3.Back");
	 System.out.println("Enter 1 for Laptops  or 2 for Mobiles or 3 for Back");
	 Scanner electronicsObject= new Scanner(System.in); 
	
	 int electronicsChoice = electronicsObject.nextInt();
    if(electronicsChoice==1)
    {
    	
    	Laptops LaptopsType=new Laptops();
    	
    }
    else if(electronicsChoice==2)
    {
    	Mobiles mobileType=new Mobiles();
    }
    else if(electronicsChoice==3)
    {
    	MainPage mainPageObject=new MainPage();
    }
    else
    {
    	System.out.println("Enter valid choice");
    }
	
}
}
public class Electronics {
	Electronics()
	{
		try
		{
			ElectronicsMain electronicsObject=new ElectronicsMain();
		}
		catch(Exception e)
		{
			System.out.println("Entered choice is Not an Integer!!");
			System.out.println("Re-Enter correct choice");
			ElectronicsMain electronicsObject=new ElectronicsMain();
		}	 
	}

}
