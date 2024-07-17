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
            In java string is basically an object that represents a sequence
            of char values. An array of characters works same as java strings.

            String is non primitive datatype create by primtive datatype
            How to create
            String literal
            By new literal

            Reference - stack memory
            Actual content goes to - heap memory

            under heap we have string constant area/pool

            if we make similar/multiple string pair reference to string pool
            if we make object it is not stored in string pool
            so use string literal for efficiency

            String object are immutable

            Once a String Object is created its data or state cant be changed

         */


            //  The String object containing "Palash" is created on heap
            //  The reference variable newNameObj is created on stack
            //  Heap is managed by jvm and its where garbage collection takes place

        // reference variable local var (newNameObj) & method calls are stored in stack
        // actual object stored in heap

        String name = "Palash";
        //name = "A";
        String sameName = "Palash";// In string pool
        String newNameObj = new String("Palash");

        System.out.println(name);
        System.out.println(newNameObj);
        System.out.println("Palash");

        // Comparing string in java
        if(name == sameName){
            System.out.println("Same");
        }

        if(name == "Palash"){
            System.out.println("name == \"Palash\":Same");
        }
        if(newNameObj == "Palash"){
            System.out.println("newNameObj == \"Palash\":Same");
        }else{
            System.out.println("newNameObj == \"Palash\" not Same");
        }

        if(name == newNameObj){
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }

        // In comparison operator == memory references are checked
        // In case of primtive datatype value should be checkedby ==
        // In non primitive Datatypes reference is should be checked by .equals

        // Use equals method in this case

        if(name.equals(newNameObj)){
            System.out.println("Names are equal");
        }else{
            System.out.println("Names are not equal");
        }

        // equals also checks case
        name = "PALASH";

        if(name.equals(newNameObj)){
            System.out.println("Names are equal");
        }else{
            System.out.println("Names are not equal cap");
        }


        // Use equalsIgnoreCase
        if(name.equalsIgnoreCase(newNameObj)){
            System.out.println("Names are equal");
        }else{
            System.out.println("Names are not equal");
        }

    }
}
