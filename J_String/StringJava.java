package J_String;

public class StringJava {

    /*
        Basics of string
        How to create string
        How strings stored in java
        Immutability in strings
        Comparing two strings in java
        Java strings methods
     */
    public static void main(String[] args) {

        /*
            In java string is basically an object that represents a sequence of char values
            An array of characters works same as java strings

            How to create
            String literal
            By new literal

            reference - stack memory
            actual content goes to - heap memory

            under heap we have string constant area/pool

            if we make similar/multiple string pair reference to string pool
            if we make object it is not stored in string pool
            so use string literal for efficiency

            String object are immutable

            Once a String Object is created its data or state cant be changed

         */

        String name = "Palash";
        //name = "A";
        String sameName = "Palash";// In string pool

        String newName = new String("Palash"); // In simple heap

        System.out.println(name);
        System.out.println(newName);

        System.out.println("Palash");

        // Comparing string in java

        if(name == sameName){
            System.out.println("Same");
        }

        if(name == newName){
            System.out.println("Same ");
        }else{
            System.out.println("Not same");
        }

        // In comparison operator == memory references are checked
        // In case of primtive datatype value checked
        // In non primitive C_Datatypes_In_Java.datatypes reference is checked

        // Use equals method in this case

        if(name.equals(newName)){
            System.out.println("Names are equal");
        }else{
            System.out.println("Names are not equal");
        }

        // equals also checks case
        name = "PALASH";

        if(name.equals(newName)){
            System.out.println("Names are equal");
        }else{
            System.out.println("Names are not equal");
        }


        // Use equalsIgnoreCase
        if(name.equalsIgnoreCase(newName)){
            System.out.println("Names are equal");
        }else{
            System.out.println("Names are not equal");
        }

    }
}
