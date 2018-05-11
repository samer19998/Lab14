package edu.handong.csee.java.lab14.prob03;

public class Powercalc {
	public long power(int n, int p) throws Exception//special method
	{
		long r = 0;// value 
		
		r = (long)Math.pow(n, p);// mathematic equation
		if(n < 0 || p < 0 )//if statement
		{
			if(n == 0 && p == 0)//if statement
			{
				throw new Exception("n and p should not be zero.");//to throw the exception
			}
		    }
		return r;// return value of the method above
		}

	}


