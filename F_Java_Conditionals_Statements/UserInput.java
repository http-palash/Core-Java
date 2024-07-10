package F_Java_Conditionals_Statements;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Age is : "+ age );

        System.out.println("Enter two numbers : ");
        int n1 = sc.nextInt();
        long n2 = sc.nextInt();
        int result = n1 + (int)n2;
        System.out.println(result);

        sc.close();
    }
}
