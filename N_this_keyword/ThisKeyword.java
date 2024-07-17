package N_this_keyword;

/*
    this keyword:
    In java, this keyword is used to refer to the current object inside a method
    or a constructor.

    We mostly use this keyword to remove any ambiguity in variable Names. We
    can also use this to invoke methods of the current class or to invoke a
    constructor of the current class
 */

public class ThisKeyword {

    public static void main(String[] args) {
        Complex num1 = new Complex();
        Complex num2 = new Complex(4,5);


        System.out.println("Adding two complex num: ");
        Complex result = num1.add(num2);
        System.out.println(num1); // N_this_keyword.Complex@5f184fc6
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

    Complex(int a, int b){
        this.a = a;
        this.b = b;
        //this to remove ambiguity
    }

    public Complex add(Complex num2){

        System.out.println(this); // N_this_keyword.Complex@5f184fc6
        this.print();// current obj print
        num2.print();
        return new Complex(a+num2.a , b+num2.b);
    }

    void print(){
        System.out.println(a+"+"+b+"i");
    }
}

