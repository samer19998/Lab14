package edu.handong.csee.java.lab14.prob03;
import java.util.Scanner;

public class Main {
    public static final Powercalc superCalc = new Powercalc();//special type method
    public static final Scanner keyboard = new Scanner(System.in);//special type method
    
    public static void main(String[] args) {//main method
        while (keyboard.hasNextInt()) {//
            int n = keyboard.nextInt();//to get the value from the keyboard
            int p = keyboard.nextInt();//to get the value from the keyboard
            
            try {//try block
                System.out.println(superCalc.power(n, p));//print out the line
            } catch (Exception e) {//catch block
                System.out.println(e);//to print out the exception
            }
        }
    }


}
