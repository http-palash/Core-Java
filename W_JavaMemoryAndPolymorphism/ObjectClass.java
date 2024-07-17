package W_JavaMemoryAndPolymorphism;


import java.util.Objects;

class Car{
    String model;
    int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }


        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", year=" + year +
                    '}';
        }

    //    @Override
    //
    //    public int hashCode(){
    //        int initialNumber = 31;
    //        initialNumber += year;
    //        initialNumber += model.hashCode();
    //        // model => string hashcode implicitly colculated by java
    //        return initialNumber;
    //    }

    //    use alt+insert to generate


    //    @Override
    //    public boolean equals(Object o) {
    //        if (this == o) return true;
    //        if (o == null || getClass() != o.getClass()) return false;
    //        Car car = (Car) o;
    //        return year == car.year && Objects.equals(model, car.model);
    //    }

    // @Override - method does not override or implement a method from a supertype
    public int hashcode(){
        return Objects.hash(model,year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    public boolean equals(Car that){
        //Car that = (Car)obj;
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
        Car obj3 = new Car("Honda",2023);

        System.out.println(obj); // JavaMemoryAndPolymorphism.Car@5f184fc6
        System.out.println(obj2); // JavaMemoryAndPolymorphism.Car@3feba861

        System.out.println(obj.toString());
        System.out.println(obj2.toString());
        // giving object a string representation for human redable format

        System.out.println(obj == obj2);
        System.out.println(obj.equals(obj2));

        System.out.println(obj == obj3);
        System.out.println(obj.equals(obj3));

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
    }

}
