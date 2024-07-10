package S_staticKeyword;

public class person {
    public static void main(String[] args) {
        StaticKeyword obj = new StaticKeyword();
        System.out.println(obj.count);
        obj.count = 70;
        System.out.println(obj.count);
        StaticKeyword.count = 80;
        System.out.println(obj.count);

        // Eg Math is static method
        System.out.println(Math.max(5,9));

        StaticKeyword.printHello();
        /*
            StaticKeyword.printHi();
            java: non-static method printHi() cannot be referenced from a static context

         */
        obj.printHi();
    }
}
