package W_JavaMemoryAndPolymorphism;

public class Memory {

    static void changeValue(int a){
        a = 10; // heap
    }
    static void changeValue(int a,Data obj){
        a = 10; // heap
        obj.data = 100;
    }

    public static void main(String[] args) {
        //int a = 5; // stack
        Integer a = 15; //autoboxing
        changeValue(a);
        System.out.println(a); // op  = 5

        Data obj = new Data(); // heap memory

        obj.data = 5;
        changeValue(a,obj);
        System.out.println(obj.data);
    }
}


class Data{
    int data;
}