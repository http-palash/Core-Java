/*
    1.Constructors are invoked implicitly when we instantiate object
    2.Two rules for creating constructors are:
        a.The name of constructors should be same as class
        b.In Java, a constructor must not have an explicit return type,
        not even void. This is because a constructor's sole purpose
        is to initialize an object when it's created,
        and it implicitly returns a reference to the newly created object.
    3.If a class doesn't have constructors, the java compiler automatically
      create a default constructor during runtime . The default constructor
      intializes instance variable with default values.
    4.Default constructor is automatically created by java compiler if it is not
      explicitly defined
    5.A constructor cannot be abstract or static or final
    6.A constructor can be overloaded but cannot be overriden.
 */

package M_Constructors;

public class Constructors {

    public static void main(String[] args) {
        Complex num1 = new Complex();
        Complex num2 = new Complex(4,5);
        Complex num3 = new Complex(4);
        //  num1.a = 9;
        //  num1.b = 4;
        num1.print();
        num2.print();
        num3.print();

        /*
            this keyword:

            In java, this keyword is used to refer to the current object inside a method
            or a constructor.

            We mostly use this keyword to remove any ambiguity in variable Names.
            We can also use this to invoke methods of the current class or to
            invoke a constructor of the current class
         */

        System.out.println("Adding two complex num: ");
        Complex result = num1.add(num2);
        System.out.println(num1);
        result.print();
    }
}


class Complex{


        int a,b;

        Complex(){
            a = 0;
            b = 0;
            System.out.println("Creating a new Object");
        }

       //  Complex(int real, int imaginary){
       //     a = real;
       //     b = imaginary;
       //  }

        Complex(int a, int b){
            this.a = a;
            this.b = b;
            //this to remove ambiguity
        }

        Complex(int real){
            a = real;
            b = 12;
        }

        Complex add(Complex num2){
            // not a contructor it is a add function on class Complex
            // with return type Complex

            System.out.println(this);//Contructors.Complex@27973e9b

            //Object package.classname@reference

            this.print();// current obj print
            num2.print();
            return new Complex(a+num2.a , b+num2.b);
        }

        void print(){
            System.out.println(a+"+"+b+"i");
        }
}
