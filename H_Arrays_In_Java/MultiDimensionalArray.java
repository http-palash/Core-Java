package H_Arrays_In_Java;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int num[] = {1,2,3,4,5};
        int sum  = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum by for loop : "+sum);
        sum = 0;

        for(int n : num){
            sum += n;
        }

        System.out.println("Sum by for each loop : "+sum);



        // int min = 0;
        // Always Intialize min with biggest number
        // Integer wrapper class

        int min = Integer.MAX_VALUE;
        //  int max = Integer.MIN_VALUE;
        int max = 0;

        for(int number : num){
            if(number < min){
                min = number;
            }else{
                max = number;
            }
        }

        System.out.println("Min is : "+min+" and  Max is : "+max);


        /* two d or multidimensional arrays
                A multidimensional array in JavaScript is an array of arrays.
                It is a type of array that allows developers to store data
                in a matrix-like structure.
         */
        int mark[][] = new int[4][3];

        mark[0][0] = 12;
        mark[0][1] = 98;
        mark[0][2] = 108;

        mark[1][0] = 12;
        mark[1][1] = 98;
        mark[1][2] = 108;

        mark[2][0] = 12;
        mark[2][1] = 98;
        mark[2][2] = 108;

        mark[3][0] = 12;
        mark[3][1] = 98;
        mark[3][2] = 108;

        // mark[4][0] = 12;
        // mark[4][1] = 98;
        // mark[4][2] = 108;


        System.out.println(mark[0][0]);
        System.out.println(mark[0][1]);
        System.out.println(mark[0][2]);

        System.out.println(mark[1][0]);
        System.out.println(mark[1][1]);
        System.out.println(mark[1][2]);



        int mar[][] = {
                        {0, 0, 0},
                        {1, 1, 1},
                        {2, 2, 2},
                        {3, 3, 3},
                    };

        System.out.println(mar[0][0]);
        System.out.println(mar[0][1]);
        System.out.println(mar[0][2]);
//        System.out.println(mar[0][3]);


    }
}
