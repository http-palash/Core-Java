package X_Exception_Handling;

public class FinallyBlockInException {


    public static void main(String[] args) {
        int a [] = new int[5];

        System.out.println("Hello");


        try{
            System.out.println(a[9]);
        }catch(Exception e){
            System.out.println("All exception handled");
            //System.exit(0);//
        }finally {
            System.out.println("I will run always");
        }


        try{
            System.out.println(a[9]);
        }
        /*catch(Exception e){
               System.out.println("All exception handled");
               Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 5
               at X_Exception_Handling.FinallyBlockInException.main(FinallyBlockInException.java:22)
            }
        */
        finally{ // good practice to add this block used to close connection
            // sometimes not run in system.exit(0); or error/ exception in finally block
            // the death of the threa
            System.out.println("I will run always 2nd time ");
        }

        System.out.println("Bye");
    }
}
