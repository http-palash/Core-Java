package H_Arrays_In_Java;

public class BasicsOfArray {

    public static void main(String[] args) {


        /*
            How array works
            Creating and declaring arrays
            For each loop
            Multidimensional arrays
        */

        //  Arrays are stored in contiguous memory [consecutive memory locations]

        /*
            declarations
            int intArray[];
            or int[] intArray;

            allocating memory to array

            intArray = new int[20];
         */

        int age[]; // declaration
        age = new int[5]; //allocation

        // int age[] = new int[5];

        age[0] = 1;
        age[1] = 2;
        age[2] = 3;
        age[3] = 4;
        // age[4] = 5;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        // System.out.println(age[5]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // at arrays.BasicsOfArray.main(BasicsOfArray.java:42)

        System.out.println(age.length);

        int marks[] = {1, 2, 3, 4, 5};
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks.length);

        String names[] = {"Ram","Shyam","Rahul","Karan","Arjun"};

        // string n = 'java: unclosed character literal';
        // char c[] = 'java: unclosed character literal';

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name "+(i+1)+" is : "+ names[i]);
        }

        for(String i : names){
            System.out.println(i);
        }
    }

}


