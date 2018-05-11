package edu.handong.csee.java.lab14.prob01;
import java.util.Scanner;//to import Scanner from another class
import java.util.Random;//to import 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);//to use the Scanner class
		Random rand = new Random();//instantiating
		int limit = 0, speed = 0;//defining integer variables
		
		System.out.print("Set the speed limit, officer:");//print out the line 
		limit = keyboard.nextInt();//to get the limit from the Scanner class
		speed = rand.nextInt(101);//to get speed from the Scanner class
		
		SpeedLimiter lim = new SpeedLimiter(limit, speed);//isntantiating with two integer variables
		
		lim.WarnSpeedLimit();//if the speed goes above the limit it will give a warn
	
		keyboard.close();//order to close
		
	}

}
