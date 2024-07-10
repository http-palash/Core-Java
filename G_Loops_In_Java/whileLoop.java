package G_Loops_In_Java;
import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {

        // while loop : only condition known don't know iteration
        // test condition here
        // test condition updated inside loop
        // like finding number of  nodes in link-list
        // condition checked first


        int i = 0;

        while(i < 5){
            System.out.println(i);
            i++;
        }


        Scanner sc = new Scanner(System.in);

        boolean haslearnt = false;

        while(!haslearnt){
            System.out.println("Went to school tried to learn");
            System.out.println("Have to understood : true/ false");
            haslearnt = sc.nextBoolean();
        }

        // do while loop
        // condition checked last

         i = 0;

        while(i <= 5){
            System.out.println(i);
            i++;
        }
        System.out.println("i is "+i+" now");
        do{
            System.out.println(i);
            i++;
        }while(i<=5);




    }
}
