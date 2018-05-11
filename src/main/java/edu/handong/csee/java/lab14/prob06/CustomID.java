package edu.handong.csee.java.lab14.prob06;

public class CustomID extends Exception {//it extends Exception class
	
		private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"};//String variable
		private String name = "";//String variable
		private int age = 0;// int variable
		private String race = "";//String variable
		private int state = 0;//integer variable

	public void set_name(String s) throws Exception//special method
	{
		if(s.length() < 5) {//if statement
			state = 0;
			throw new Exception("Your name is short! Try again!");//throw an Exception
	}

	else {//otherwise
		name = s;// matching the name with String
		System.out.println("Name is valid");//print out the line
		System.out.println("Name: " + this.name);//print out the line + name
		state++;//to continue the loop
	}
	}

	public void set_age(int num) throws Exception//method 
	{
		if(num < 18) {//if statement
			state = 1;
			throw new Exception("You are too young! Try again!");// print out the line
}
	else {//otherwise
		this.age = num;// matching age = num
		System.out.println("Age is valid");// print out the line
		System.out.println("Age: " + this.age);// print out the line
		state++;// to continue the loop
	}
}

	public void set_race(String race) throws Exception{//method
		for(int i = 0; i < races.length; i++)//array
{
			if(races[i].equals(race)) {// if statement 
				this.race = races[i];//match this.race with races( same value)
				System.out.println("Race is valid");// print out the line
				System.out.println("Race: " + races[i]);// print out the line + name
				state = 0;// the variable = 0
				return;// to return value
}
}
		state = 2;// variable value = 2
		throw new Exception("Human! Try again.");//// to throw the wxception
}
	public int getState()//method
{
		return state;// return the value of state
}
}

