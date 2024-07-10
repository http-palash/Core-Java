package J_String;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.nextLine();
        //String lastName = sc.nextLine(); consider words before 1st space


        System.out.println("Your full name is "+firstName+" "+lastName);
        System.out.println("Your full name is "+firstName+lastName); // string o/p


    }
}
