package W_JavaMemoryAndPolymorphism;


class Car{
    String model;
    int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    /*
        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", year=" + year +
                    '}';
        }
     */

    @Override

    public int hashCode(){
        int initialNumber = 31;
        initialNumber += year;
        initialNumber += model.hashCode();
        // model => string hashcode implicitly colculated by java
        return initialNumber;
    }

    public boolean equals(Object obj){
        Car that = (Car)obj;
        if(this.model.equals(that.model) && this.year == that.year){
            return true;
        }
        return false;
    }

}

public class ObjectClass {

    public static void main(String[] args) {
        Car obj = new Car("Honda",2022);
        Car obj2 = new Car("Honda",2022);

        System.out.println(obj); // JavaMemoryAndPolymorphism.Car@5f184fc6
        System.out.println(obj2); // JavaMemoryAndPolymorphism.Car@3feba861
        System.out.println(obj.toString());
        System.out.println(obj2.toString());

        System.out.println(obj == obj2);
        System.out.println(obj.equals(obj2));

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }

}
