package edu.handong.csee.java.lab14.prob05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){// main method
        try{// try block
        Scanner keyboard = new Scanner(System.in);//instantiating
        String s = keyboard.nextLine();////to get the value of s
            Main.myTest(s);
        } catch(MyException e){//catch block
            System.out.println("Inside catch block: " + e);//print out the line
        }
    }
     
    static void myTest(String s) throws MyException{//special method that has actions
        if(s.equals("null")){//if statement(s = 0)
            throw new MyException("String value is null");//throwing exception
        }
        else//otherwise
        System.out.println("String value is:" + s);//it prints put this line
    }
}
