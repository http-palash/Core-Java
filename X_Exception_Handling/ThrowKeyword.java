package X_Exception_Handling;

public class ThrowKeyword {

    // static int getNumberFromArray(int a[]) {
    static int getNumberFromArray(int a[]) throws ArithmeticException{
        return a[8];
    }

    public static void main(String[] args) {
        int a[] = new int[5];

        try {
         getNumberFromArray(a);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        /*
         Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 5
         at X_Exception_Handling.ThrowKeyword.getNumberFromArray(ThrowKeyword.java:6)
         at X_Exception_Handling.ThrowKeyword.main(ThrowKeyword.java:11)
         Read error down to up
         */

    }
}
