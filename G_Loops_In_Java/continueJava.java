package G_Loops_In_Java;

public class continueJava {

    //The continue statement passes control to the next iteration of the nearest
      //  enclosing do , for , or while statement in which it appears,
    public static void main(String[] args) {

    //        for (int i = 0; i < 30; i++) {
    //
    //            if(i%2==0 || i%3==0 || i%5 ==0 )  continue;
    //            System.out.println(i);
    //
    //        }

        // Nested loops for patterns matrix etc, more nesting = less optimized code

        // prime no
        boolean isprime;

        for (int i = 2; i < 50 ; i++) {
            isprime = true;
            for (int j = 2; j*j <= i; j++) {
                if(i%j==0){
                    isprime = false;
                    break;
                }

            }
            if(isprime){
                System.out.println(i);
            }
        }

        // print matrix

        for (int i = 0; i < 10; i++) {

            for (int j = 1; j < 6; j++) {

                System.out.print(j+" ");
            }
            System.out.println();
        }


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            int j = 0;
            while(j < 5){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }


        for (int i = 2; i <30 ; i++) {
            boolean isPrime = true;
            for (int j = 2; j*j <=i ; j++) {
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
                if(isPrime){
                 System.out.print(i+" ");
                }
        }

        System.out.println("\nLabel: ");
        outerLoop:
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while(j <= 5){
                if(j==3) break outerLoop;
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}
