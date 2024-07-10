package F_Java_Conditionals_Statements;

public class TernaryOperator {

    public static void main(String[] args) {

        // ternary operator
        // Evaluates test condition and executes a block of code based on the result of the condition
        // ternary operators can be used to replace certain type of if else statements
        // condition ? expression1 : expression2;
        // ternary operators returns some value
        // cant write sout in ternary exp because it returns void

        int max;
        int a = 4;
        int b = 9;
        max = a > b ?  a :  b;

        System.out.println("max is : "+max);

        int n1 = 3, n2 = 5, n3 = 8;

        max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        System.out.println("Max no is "+ max);
    }
}
