package S_staticKeyword;
import java.lang.Math;

public class StaticBlock {


    public  static  final String ScientificName = "Homo Sapiens";

    static {
        System.out.println("Called from static block 1");
    }
    static {
        System.out.println("Called from static block 2");
    }

    int count = 90 ;

    static {
        System.out.println("Called from static block 3");
    }
    static {
        System.out.println("Called from static block 3");
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(obj.count);

        //  public static final double PI = 3.141592653589793;
        System.out.println(Math.PI);

        /*
            4.The modification of the static field value is not allowed/ discouraged use public static final in this case
            eg: value of Math.pi (public static final)
         */
    }
}
