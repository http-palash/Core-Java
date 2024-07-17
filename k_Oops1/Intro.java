package k_Oops1;

// Multiple classes can be created
// Only public class can be one which has main function

    /*

        a.Class and Objects
        b.Constructors
        c.Method and constructor Overloading
        d.This keyword in java

          A class can also be seen as user defined datatype where any object of
          defined datatype has some predefined properties and behaviour

       1. Class is  a blueprint which defines some properties and behaviours.
          And object is an instance of a class which has those properties and
          behaviours attached
       2. A class is not allocated memory when it is defined.
       3. An object is allocated memory when it is created.
       4. Class is logical entity whereas objects are physical entity.
       5. A class is declared only once. On the other hand, we can create
          multiple objects of class

       6. A class is a way to arrange data and behaviour information. It is a template
          that must be implemented by its objects.

       7. A class can also be seen as user defined datatype where any object of
          defined datatype has some predefined properties and behaviour
    */

public class Intro {

    public static void main(String[] args) {

        // Scanner, Math, String class prebuilt class

        // Class is non-primitive user-defined datatype
        // Metaspace(In ram) <= stores classes metadata
        // Object stored in heap memory
        // Cant directly interact with class (logical/virtual entity)
        // We can interact through object physical entity

        Dog d1 = new Dog();
        d1.name = "Bruno";
        d1.bark();
        d1.walk();

        System.out.println();

        Dog d2 = new Dog();
        d2.name="Cutiepie";
        d2.walk();


        Complex num1 = new Complex();
        num1.a = 3;
        num1.b= 6;
        num1.print();

    }
}


class Dog{

    String name;
    int age;
    void walk(){
        System.out.println(name + " is walking");
    }
    void bark(){
        System.out.println(name+" is Barking");
    }
}

class Cat{

}

// Creating non-primitive datatype
class Complex{

    int a,b;
    void print(){
        System.out.println(a+" + "+b+"i");
    }
}



