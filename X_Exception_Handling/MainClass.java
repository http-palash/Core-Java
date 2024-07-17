package X_Exception_Handling;

public class MainClass {


    public static void main(String[] args) {


        int a[] = new int[5];
        System.out.println("Hello");

        /*
            try{
                int result = 5/0;
                System.out.println(a[9]);
                // control goes to catch
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Try to access out of bound");
            }catch(ArithmeticException e){
                //System.out.println(e.getStackTrace());
                //System.out.println(e);
                System.out.println(e.getMessage());
            }
        */

        //to  handle by same

        /*
            try{
                int result = 5/0;
                System.out.println(a[8]);
                // runtime exceptions check by cmd ctrl + click
            }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
                System.out.println("Handling the exception");
            }catch(RuntimeException e){

            }
       */

        // to handle all type of exception
        try {
            int result = 5 / 0;
            System.out.println(a[8]);
        }catch(Exception e){ // Parent Class Exception
            System.out.println("All exception handled");
        }



        System.out.println("End of code ");
    }
}
