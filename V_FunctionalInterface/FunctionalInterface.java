package V_FunctionalInterface;
import java.lang.*;

public class FunctionalInterface {

    /*
        SuperInterface obj = new SuperInterface(){
            @Override
            public void interfaceMethod() {
                System.out.println("Functional interface");
            }
        };
     */
    // lambda exp works only when one method is there in functional interface
    SuperInterface obj = () -> {

    };


    public static void main(String[] args) {

        Walkable obj1 = (int steps) -> {
            System.out.println("Walked steps "+ steps +" steps");
            return steps;
        };

        obj1.walks(8);

        //Walkable obj2 = (int steps) -> 2 * steps;
        Walkable obj2 = (steps) -> 2 * steps;

        System.out.println(obj2.walks(10 ));
    }


}


@java.lang.FunctionalInterface

interface SuperInterface{
    void interfaceMethod();

}

interface  Walkable{
    int walks(int steps);
}

/*
    Functional interface : lamba expression
 */