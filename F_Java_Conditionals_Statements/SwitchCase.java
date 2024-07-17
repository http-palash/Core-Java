package F_Java_Conditionals_Statements;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day : ");
        float day = sc.nextFloat();

        /*
          The switch statement or switch case in java is a multi-way branch statement.
          Primitive datatypes string char works only.
          The Java switch statement executes one statement from multiple conditions.
          It is like if-else-if ladder statement.
        */

        switch ((int)day){ //float not works in switch
            case 1: case 10:
                System.out.println("Today is Sunday");
                System.out.println("Holiday");
                break;

            case 2:
                System.out.println("Today is Monday");
                break;

            case 3:
                System.out.println("Today is Tuesday");
                break;

            case 4:
                System.out.println("Today is Wednesday");
                break;

            case 5:
                System.out.println("Today is Thursday");
                break;

            case 6:
                System.out.println("Today is Friday");
                break;

            case 7 :
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Invalid day ..!");
        }


        int time = 11;

        if(time >= 10){
            if(time <= 20){
                System.out.println("Office is open");
            }
            else{
                System.out.println("Office is closed");
            }
        }else{
            System.out.println("Office is closed");
        }

        time = 21;
        if(time >= 10 && time <= 20){
            System.out.println("Office is open");
        }else{
            System.out.println("Office is closed");
        }


        time = 12;

        if(time == 12 || time == 18){
            System.out.println("Time for snacks");
        }else{
            System.out.println("Time to work");
        }
    }
}
