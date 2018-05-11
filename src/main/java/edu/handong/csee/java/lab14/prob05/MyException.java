package edu.handong.csee.java.lab14.prob05;

public class MyException extends Exception {
	private String message = null;//variable as String type
	
		public MyException() {//method
			super();//super class
		}
		
		public MyException(String message) {// method
			super(message);
			this.message = message;//to identify both variables as the same, we used this because they share the same name
			
		}
		
		public String toString() {//method
			return message;//return value
		}
	

}
