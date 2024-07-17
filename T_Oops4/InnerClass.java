package T_Oops4;

// Nested inner class used for encapsulation

public class InnerClass {

    class Toy{
        int price;
    }

    static class PlayStation{
        int price;
    }

    public static void main(String[] args) {
        // Toy toy = new Toy(); //invalid : non-static variable this cannot be referenced from a static context
         Toy toy = new InnerClass().new Toy(); // outerclass obj
        // InnerClass obj = new InnerClass();
        // Toy toy = obj.new Toy();
        toy.price = 50;
        System.out.println(toy.price);

        PlayStation playstation = new InnerClass.PlayStation(); // accessing direct by class name


    }
}
