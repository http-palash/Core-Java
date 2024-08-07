

/*
    Inheritance is one of the key feature of OOP that allows us to create a
    new class from an existing class.

    The new class that is created is known as subclass (child or derived class)
    and the existing class from where the child class is derived is known as superclass
    (parent or base class)

 */

// public final class Vehicle {
// java: cannot inherit from final Inheritance.Vehicle

package P_Inheritance;

//public class Vehicle { java: start() has private access in P_Inheritance.Vehicle
class Vehicle {

    final int gears = 5;

    int wheelsCount;

    public Vehicle(){
        System.out.println("Creating a vehicle instance..");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicles with wheels " + wheelsCount);
    }

    void start(){

         System.out.println("Vehicle is started ");
    }

    final void accelerate(){

        System.out.println("Vehicle is accelerating");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        // v1.gears = 4; java: cannot assign a value to final variable gears
    }
}

