package P_Inheritance;

//public class Car{
/*
  java: cannot find symbol
  symbol:   variable wheelsCount
  location: variable obj of type Inheritance.Car
*/


public class Car  extends Vehicle {

    // Method over-ridding
    /*
        If a subclass provides the specific implementation of the method that has been
        declared by one of its parent class, it is known as method overriding.

        Method overriding is also known as runtime polymorphism. Hence, we can achieve
        polymorphism in java with the help of inheritance

        Method overloading - compile time polymorphism
     */



    /*
        Final keyword in java

        In java final keyword is a non-access modifier that is used to define entities
        that cannot be changed or modified

        Final variable : Variable with final cannot be assigned again

        Final method : Method with final cannot be overridden by its subclass

        Final class : Class with final cannot be extended or inherited from other classes

     */


    /*
        void accelerate(){
            System.out.println("skjd");
            java: accelerate() in Inheritance.Car cannot override accelerate() in Inheritance.Vehicle
            overridden method is final
        }
     */


    String color;
    String model;

    public Car(){

        super(5);
        System.out.println("Car is being created..");
    }




    void start() {

        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        super.start();
        System.out.println(this);
        System.out.println(this.model+ " car is starting");
    }

//    Car braking(){
//        return this;
//    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 10; // value updated after default constructor
        obj.color = "Yellow";
        obj.model = "Gwagon";
        obj.start();
        obj.accelerate();
        System.out.println(obj.wheelsCount);

        // Object class in java - prebuilt class
        // obj.


        /*
            Super keyword in java

            super is a special keyword in java that is used to refer to the
            instance of the immediate parent class.

            Used of super keyword in java:
            1.It is used to refer to an instance variable of the immediate parent class
            2.It is used to invoke a method of the immediate parent class
            3.It is used to invoke a constructor of immediate parent class


            call to super and this must be first statement in constructors body
            this and super cannot be used together
         */

        /*
          Multiple inheritance is not allowed in java (it introduces ambiguity)
          Multilevel inheritance is allowed in java (no ambiguity)
         */




    }


}
    /*
       this vs super keyword
       Both are implicit  reference variables

       this is used to represent the current class.
       this is used to invoke methods of current class.
       this is used to invoke a constructor of current class.
       this refers to the instance and static variables of the current class.
       this can be used to return and pass as an argument int the context of a current class object


       super keyword is used to represent the immediate parent class.
       super is used to invoke methods of the immediate parent class.
       super is used to invoke constructor parent of immediate parent class.
       super refers to the instance and static variables of immediate parent class.
       super can be used to return and pass as an argument int the context of an immediate parent class object.


        this is actual object
        super is just keyword not an object
     */
    class Scooter {


        void braking(Car car){
            System.out.println(car.model+" is braking");
        }
    }

