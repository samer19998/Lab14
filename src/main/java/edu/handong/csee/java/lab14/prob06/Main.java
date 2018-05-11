package edu.handong.csee.java.lab14.prob06;
import java.util.Scanner;
public class Main {
	String name, race;// string type variables
	int age = 0;// integer type variables
	Scanner keyboard = new Scanner(System.in);// instantiating the Scanner so we can use it 
	CustomID obj = new CustomID();//constructor
	boolean repeat = true; {//boolean type that returns a value of true or false

	while(repeat)
	{
	try {// try block
	if(obj.getState() == 0) {// if statement
	System.out.print("Enter your name: ");//system will print this line
	name = keyboard.nextLine();// get the name from the keyboard
	obj.set_name(name);//set the name 
	}
	else if(obj.getState() == 1) {// next 
	System.out.print("Enter your age: ");// it'll print this line
	age = keyboard.nextInt();// to get the age from the keyboard
	keyboard.nextLine();//for String type variable
	obj.set_age(age);// set the age
	}
	
	else if(obj.getState() == 2) {// next
			System.out.print("Enter your race: ");//it'll print this line
			race = keyboard.nextLine();//get the value of race from keyboard
			obj.set_race(race);// set race
	}
		}
			catch(Exception e){// catch block
			System.out.println(e.getMessage());// print the line
			continue;//to keep the program going
	}
		}
}
		


}
