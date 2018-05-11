package edu.handong.csee.java.lab14.prob04;

public class Boundary {
	private static int[] a = new int[5];
	private static int count = 0;
	public void recieve(int num)throws ArrayIndexOutOfBoundsException
	{
	int i = count;
	a[i] = num;
	count++;
	System.out.println("array[%d]<- %d\n, i, num");
	}

}
