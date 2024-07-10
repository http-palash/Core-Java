package B_Variables_In_Java;

public class Variables {

    public static void main(String[] args) {

        boolean isPasses = true;
        int count = 12;
        byte marks = 125;
        short studentsCount = 1235;

        //        unsigned byte marks = 129;
        //        byte marks = 129; // error loosy conversion
        //        Java, there is no unsigned keyword for primitive types like byte
        //        since we cannot use unsigned byte, we'll switch to using short.


        //         precision up-to 6 decimal places in float datatype

        float pi = 3.14159265358979323846264338327950288419716939937510f; // use f for float by def it converted into double otherwise

        //         precision up-to 15 decimal places in double datatype

        double secondPi =  3.14159265358979323846264338327950288419716939937510;


        char myLetter = 'A';

        //        char myLetter2 = 'A@'; // error too many characters



        //        System.out.print();   no new line
        System.out.println(count);
        System.out.println(marks);
        System.out.println(pi);
        System.out.println(secondPi);
        System.out.println(myLetter);

        // Type casting / type conversion
        // implicit conversion / widening
        // This can be done directly
        // short -> int -> long _/
        // short <- int <- long X

        int c = 10; // warning c is redundent
        long d = c;
        System.out.println(c);
        System.out.println(d);


        // explicit type conversion

        long n = 300;
        int n1 = (int)n;
        System.out.println(n);
        System.out.println(n1);


        int age =  130;
        byte newAge = (byte) age;
        System.out.println(newAge); // -127 to +127 range byte

    }
}
