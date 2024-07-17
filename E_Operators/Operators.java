package E_Operators;

public class Operators {

    public static void main(String[] args) {

        // Arithmetic operators + - / * %
        int a = 12;
        int b = 7;

        int c = a + b;

        System.out.println(c);

        c = a - b;
        System.out.println(c);

        float d = (float)a / (float)b;
        System.out.println(d);

        d = (float)a % (float)b;
        System.out.println(d);

        // Assignment and Augmented assignment

        /*
            -=
            %=
            /=
            *=
         */

        a = 7;
        System.out.println(a);
        a -= b;
        System.out.println(a);


        // Relational operators

        /*
          ==
          !=
          >
          <
          >=
          <=
         */


        int fno = 12;
        int sno = 16;

        System.out.println(fno == sno);
        System.out.println(fno < sno);
        System.out.println(fno > sno);
        System.out.println(fno != sno);
        System.out.println(fno <= sno);
        System.out.println(fno >= sno);


        // Logical operators && || ! AND OR NOT

        boolean firstexp = true;
        boolean secondexp = false;

        System.out.println(firstexp && secondexp);
        System.out.println(firstexp || secondexp);
        System.out.println(!secondexp);

        // Bitwise operators


        // Increment decrement operators postfix prefix

        // Ternary operators

        System.out.println();


    }
}
