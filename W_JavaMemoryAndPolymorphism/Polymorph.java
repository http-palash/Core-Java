package W_JavaMemoryAndPolymorphism;


class OuterData{
    int data;
    public void printData(){
        System.out.println("Value of data : "+data);
    }

    public void printData(int data){
        System.out.println("Value of data : "+data);
    }
}

class Child extends OuterData{
    @Override
    public void printData(){
        System.out.println("Override : "+data);
    }
}

public class Polymorph {
    public static void main(String[] args) {

       //OuterData obj = new OuterData();
       OuterData obj = new Child();
       obj.printData();     // Runtime polymorphism method over-ridding
       obj.printData(9);     // Compile time polymorphism method overloading

        OuterData obj2= new OuterData();
        obj2.printData(10); // Compile time polymorphism

    }
}

