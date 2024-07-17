package T_Oops4;

public class Abstract {

    public static void main(String[] args) {
     //Vehicle v1 = new Vehicle(); //  Oops4.Vehicle is abstract; cannot be instantiated
        Car c1 = new Car();
        c1.accelerate();
        c1.brake(5);
        c1.honks();
    }
}

abstract class Vehicle{

    /*
        abstract void accelerate(){
            abstract methods cannot have a body
        }
     */
    abstract void accelerate();
    abstract int brake(int wheels);

    void honks(){
        System.out.println("Vehicle honks");
    }

    /*
        abstract void hey(){
          not allowed in abstract class
        }
        default void hey(){
          not allowed in abstract class
        }
     */
}

//abstract class Car extends Vehicle{ OR
class Car extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("Car is accelerating");
    }

    // @Override - to check spell
      void accelerated(){


    }
    // void honks(){} not necessary to implement
    // void honks(){
    //
    // } not necessary to implement


    @Override
    int brake(int wheels) {
        System.out.println("Brake pushed");
        return  wheels;
    }
}

class Human{

    void walk(){

    }
    /*
       abstract void talk(){
         // Human is not abstract and does not override abstract method talk()
       }
     */
}
