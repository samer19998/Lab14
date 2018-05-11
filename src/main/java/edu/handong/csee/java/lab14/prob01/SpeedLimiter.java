package edu.handong.csee.java.lab14.prob01;

public class SpeedLimiter {
	private int speed = 0;//integer type variable
	private int limit= 0;//integer type variable
	public SpeedLimiter(int limit, int speed) {//method 
		 this.limit = limit;//to match both of the integer of limit, we use this because the ave the same name
		 this.speed = speed;//to match both of the integer of speed, we use this because the ave the same name
		 
	}
	
	public void WarnSpeedLimit()//method
	
	{
		try {//try block
			if(this.speed > this.limit)// if statement
			{
				throw new Exception("Speed Limit" + this.limit + "km exceeded");// the program will throw this result if the speed>limit 
				
			}
			System.out.println("You are a low abiding citizen");// if this condition matches it will print this line
		}catch(Exception e) {// catch block
			System.out.println(e.getMessage());//to get the message
			System.out.println("you are being fined. ");//otherwise it prints out this line
		}
			System.out.println("Current speed" + this.speed);//prints out the current speed
		
	}

}
