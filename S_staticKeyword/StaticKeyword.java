package S_staticKeyword;

public class StaticKeyword {

    public  static int count;

    public static void printHello(){
        System.out.println("A_Basic_Java_Program.Hello java");
    }

    public void printHi(){
        System.out.println("Non-static printHi");
    }
    public static void main(String[] args) {
        System.out.println(count);
        count = 50;
        System.out.println(count);

        StaticKeyword.printHello();
        printHello();
    }
}
