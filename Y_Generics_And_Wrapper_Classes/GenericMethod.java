package Y_Generics_And_Wrapper_Classes;

/*

    One class can support multiple type of data

    Similar to generic class we can also create a method that can be used with any type
    of data is known as generic method.

    Useful - no headache of method overloading


 */
public class GenericMethod {

    /*
         static void printData(String data){
         System.out.println(data);
        }
     */

    static <E>void printData(E data){
        System.out.println(data);
    }

    /*
        <E extends Number> void doubleData(E data){
        java: method doubleData in class Y_Generics_And_Wrapper_Classes.GenericMethod cannot be applied to given types;
          required: E
          found:    java.lang.String
          reason: inference variable E has incompatible bounds
            upper bounds: java.lang.Number
            lower bounds: java.lang.String
     */
    <E> void doubleData(E data){
        System.out.println(data);
    }

    public static void main(String[] args) {

        GenericMethod obj = new GenericMethod();

        obj.doubleData(10.43);
        obj.doubleData("Palash");

        printData("Hello");
        printData(123);

        CustomClass customObject = new CustomClass();
        obj.doubleData(customObject);


    }
}


class CustomClass{
    // no tro string method prints reference of class now can override to string method
}