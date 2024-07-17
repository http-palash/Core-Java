package Y_Generics_And_Wrapper_Classes;

import java.util.ArrayList;

public class Generics {

    /*
        Generics means parameterized types.

        Using generics it is possible to create classes that work with different datatypes

        An entity such as class, interface, or method that operates on a parameterized
        type is a generic entity.
     */

    public static void main(String[] args) {
        /*
            Dog d1 = new Dog("A123");
            Dog d2 = new Dog("B123");
            Dog d3 = new Dog(12);
         */
            Dog <String>d4 = new Dog<>("B123");
            Dog <Integer>d5 = new Dog<Integer>(12);
            System.out.println(d5.getId());


        //ArrayList<Integer> = new ArrayList<>();

        Cow<String,String> c1 = new Cow(1,"Name");
        //Cow c2 = c1.getCow();
        //System.out.println(c2.id+" "+c2.name);
        //System.out.println(c2.toString());
        System.out.println(c1.toString());

    }
}

class Cow <A,B>{

    A id;
    B name;
    public Cow(A id,B name){
        this.id = id;
        this.name = name;
    }

    Cow getCow(){
        return this;
    }

    @Override
    public String toString(){
        return "Cow id is "+id+" name is : "+name;
    }
}

//class Dog <E,V>{
class Dog <E>{
    //String id;
    E id;
    //V name;

    /*
        public Dog(String id){
            this.id = id;
        }
     */

    // public Dog(E id, V name){

    public Dog(E id){
        this.id = id;
    }

    E getId(){
        return id;
    }
}


// java.util almost all classes supports generics
