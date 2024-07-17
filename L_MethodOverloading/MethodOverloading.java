/*
        1.Two or more methods can have the same name inside the same class if they
          accept different arguments. This feature us known as method overloading

        2.Method overloading is  achieved by either:

            a.changing the number of arguments

            b.or changing the datatype of arguments

        3.It is not method overloading if we only change the return type of methods.
            There must be differences int the number of parameters.
 */

package L_MethodOverloading;

public class MethodOverloading{

    public static void main(String[] args) {
        Greet obj = new Greet();

        obj.greetings();
        // Ctrl + click to check which func will be called
        obj.greetings("Palash");
        obj.greetings("Shubham",8);
    }
}


class Greet{

    void greetings(){
        System.out.println("Hello, Good morning");
    }

    void greetings(String name){
        System.out.println(name+"Hello , good morning");
    }

    void greetings(String name, int count){
        for (int i = 0; i < count; i++) {
          System.out.println(name+"Hello , good morning");
        }
    }
}