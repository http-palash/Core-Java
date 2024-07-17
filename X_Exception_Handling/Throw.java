package X_Exception_Handling;

import java.security.spec.ECField;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Throw {



    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");

        try{
                int age = sc.nextInt();
                if(age < 18){
                //throw new MyException("My error is this");
                throw new ArithmeticException("Less than 18 not allowed");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }


     //class MyException extends Exception
    //Or
    static class MyException extends Exception{

        public MyException(String message){
         super(message);

        }
     }
}
