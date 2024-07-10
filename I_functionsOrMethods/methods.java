package I_functionsOrMethods;

public class methods {

    /*
        1. How do the function work
        2. Declaring a java method
        3. Calling a method
        4. Method return tyoe
        5. Method parameter
        6. Math library methods

     */

    /*
        A method is a block of code or collection of statements or a set of code
        grouped together to perform a certain task or operation.

        It is used to achieve the reusability of code.
     */

    /*
            public int sum (int a, int b) -> method header

            public - Access specifier
            int - return type

            // Method signature

            sum - Method name
            (int a, int b) - method parameters

            {
               method body
            }


            Method Parameters :

            A method parameter is a value accepted by the method.
            As mentioned earlier, a method can also have any number of parameters

     */

    public static void main(String[] args) {

        System.out.println(args[0]);

        for(String arg : args){
            System.out.print(arg+" ");
        }
        System.out.println();

        // static - class level property to use this no need to make instance of main method
           greet(); // non-static method greet() cannot be referenced from a static context
        // public void greet(){



        average(3,4,true);
        average(5,4,false);

        double avg = avg(5.66,6.05);
        System.out.println("avg : "+avg);

    }


    public static void greet(){
        System.out.println("A_Basic_Java_Program.Hello Greetings of the day this is  static mathod can ");

        //non_static_method(); //non-static method non_static_method() cannot be referenced from a static context
    }

    public void non_static_method(){
        System.out.println("This is non static method call this using object");
    }

    public static void average(int a, int b,boolean yes_no){

        if(yes_no){
            int avg = (a+b)/2;
            System.out.println("Average is  : "+avg);
        }
    }

    public static double avg(double a,double b){
        return (a+b)/2;
        // This line will not execute after return statement is not reachable
    }
}
