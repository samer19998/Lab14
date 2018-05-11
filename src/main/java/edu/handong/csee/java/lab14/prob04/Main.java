package edu.handong.csee.java.lab14.prob04;
import java.util.Scanner;//importing Scanner class
public class Main {
	
	Scanner keyboard = new Scanner(System.in);//defining the Scanner so we can use it(instantiating)
	int n = 0;// integer variable 
	Boundary b = new Boundary();//constructor
	boolean repeat = true; {//boolean type value 
	while(repeat)
	{
		try //try block
		{
			System.out.print("Enter a variable");//print out the line
			n = keyboard.nextInt();//get the value from the keyboard
			b.recieve(n);//recieve the value
		}
		catch(ArrayIndexOutOfBoundsException e)//catch block
		{
			System.out.println("Invalid array index access!");//print out the line
			repeat = false;//value
		}
		
		
	}
}
}
