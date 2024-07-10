package T_Oops4;

public class Interface {

    /*
        An interface is a fully abstract class. It includes a group of abstract methods
        (methods without a body).

        We use the interface keyword to create inteface in java

     */

    /*

        Like abstract class we cannot create object of interfaces.
        To use interface , other classes must implement it . We use the implements
        keyword to implement an interface

        interface Language{
            public void getType();
            public void getVersion();
        }

        But one class can implement multiple class like multiple inheritance for eg
     */

    /*
        Advantages of interface :
        1.Similar to abstract classes, interfaces help us to achieve abstraction in java
        2.Interfaces are also used to achieve multiple inheritance in java
        3.All methods inside interface is implicitly public and all fields are implicitly public static final
     */

    public static void main(String[] args) {
        Monkey m  = new Monkey();
        m.eat();
        m.sing();
        m.drinks();
        // Animal.LEGS = 7; cannot assign a value to static final variable LEGS
        System.out.println(Animal.LEGS);
    }


}

interface Animal{
        // public abstract void eat(same by default below)
    void eat();
    void drinks();
    public static final int LEGS = 4;
    //int LEGS = 4; same as above
    default void walk(){

    }
    // void talk();
    // Class 'Monkey' must either be declared abstract or implement abstract method 'talk()' in 'Animal'
    default void talk(){

    }
}

interface Pet{
    void sing();
    void drinks();
}

class Monkey implements Animal,Pet{

    @Override
    public void eat() {
        System.out.println("Monkey is eating");
    }


    @Override
    public void sing() {
        System.out.println("Monkey is singing");
    }

    public void drinks(){
        System.out.println("Monkey is drinking");
    }
}
