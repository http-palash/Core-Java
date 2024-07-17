package G_Loops_In_Java;
import  java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        //A "For" Loop is used to repeat a specific block of code a known number of times.

        // for (initialization, test condition, Inc/dec)
        for(int i = 0; i < 10; i++){
          System.out.println("Hello world");
        }

        // table
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }

        // sum of n natural no
        n = n*(n+1)/2;
        System.out.println(n);

        // Or
        n = 5;
        // 1+2+3+4+5
        System.out.println("1+2+3+4+5");
        int sum = 0;
        for (int count = 0, i = 1; i<=n ; i++){
            sum += i;
            System.out.println("Interation : "+ (++count));
        }
        n = 3;

        System.out.println("2+4+6");
        // 2+4+6+8
        sum = 0;
        for (int count = 0, i = 1; i<=n ; i++){
            sum += 2*i;
            System.out.println("Iteration : "+ (++count));
        }

        System.out.println("Sum is : "+sum);

    }
}
