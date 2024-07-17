package Y_Generics_And_Wrapper_Classes;

import java.util.ArrayList;

public class WrapperClasses {

    /*
       Wrapper class is class Whose object wraps and contains primitive datatypes

       Need of wrapper class :
       1. The classes in java.util.package handles only objects and hence wrapper classes
            help in this case also.
       2. Data structure in the collection framework, such as ArrayList and Vector, Store
            only objects(reference types) and not primitive types
       3. An object is needed to support synchronization in multithreading
     */

    public static void main(String[] args) {

        Integer obj = new Integer(12);// not recommended

        Integer obj2 = Integer.valueOf(12); // recommended
        Integer obj3 = Integer.valueOf("12"); // recommended
        Boolean myBoolean = Boolean.valueOf(false);


        System.out.println(obj2*2);//   Output = 24


        // autoboxing - converting of a primitive dataype to the object of corresponding wrapper class
        Integer obj4 = 12;

        // Unboxing : Reverse process of autoboxing

        int age = obj; // java handles/parse implicitly

        //ArrayList<int> a = new ArrayList<int>(); // not allowed
        ArrayList<Integer> a = new ArrayList<Integer>(); // allowed





    }
}
