package F_Java_Conditionals_Statements;

import java.util.Scanner;

public class Ifelse{


    public static void main(String[] args) {

        // If statement executes a certain section of code if the test expression is evaluated to true
        // Statement inside the body of else is  executed when test expression is false

        int age = 24;

        if(age >= 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote");
        }

        int day = 1;
        if(day == 1){
            System.out.println("Home");
        }else{
            System.out.println("Office");
        }

        // ladder if else  executes one block of code among multiple other blocks

        if(day == 2){
            System.out.println("day is 2");
        }else if(day == 1){
            System.out.println("day is 1");
        } else if(day == 3) {
            System.out.println("day is 3");
        } else if (day == 5) {
            System.out.println("day is 5");
        }else {
            System.out.println("Hey i went somewhere");
        }

        // swap no

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("\nBefore swap\n a :%d b :%d", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("\nafter swap\n a :%d b :%d\n\n", a, b);
        sc.close();

        // Max no

        int n1 = 4, n2 = 7, n3 = 1;

         if( (n1 > n2) && (n1 > n2) )
         {
             System.out.println(n1 +" is greater");
         }else if(n2 > n3){
             System.out.println(n2 +" is greater");
         }else{
             System.out.println(n3 + " is greater");
         }

    }
}
