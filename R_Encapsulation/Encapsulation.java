package R_Encapsulation;
import R_Encapsulation.Packages.Person;

public class Encapsulation {

    /*
        Java encapsulation:
        Encapsulation refers to the bundling the fields and methods inside a
        single class. It prevents outer classes from accessing and changing fields
        and methods of a class. This also helps to achieve data hiding.
     */

/*
        Data Hiding:
        Data hiding is a way of restricting the access of our data members by hiding
        the implementation details. Encapsulation also provides a way for data hiding.

        We can use access modifiers to achieve data hiding.

         Encapsulation refers to the bundling of related fields and method together.

         This can be used to achieve data hiding

         Encapsulation in itself is not data hiding.
     */

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(5);
        System.out.println(p1.getAge());


    }
}
