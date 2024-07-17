public class Complex{

	int a, b;

	Complex(){
	 a = 10;
	 b = 30;
	}
	
	void print(){

		System.out.println(a+"+"+b+"i");
	}
	public static void main(String args[]){
		
		Complex c1 = new Complex();
		c1.print();

	}

} 


public class Complex {

    int a, b;

    Complex() {
        a = 10;
        b = 30;
    }
    
    void print() {
        System.out.println(a + "+" + b + "i");
    }

    public static void main(String args[]) {
        
        Complex c1 = new Complex();
        c1.print();

    }

}



Key Differences:

Access Modifier of Complex Class:
In Snippet 1, the Complex class is not explicitly declared with an access modifier (public, private, or protected). In Java, when no access modifier is specified, it defaults to package-private, which means it can only be accessed within the same package (package-private).
In Snippet 2, the Complex class is explicitly declared as public, which means it can be accessed from any other class.

Main Method Location:
In Snippet 1, the main method is defined in the Try class.
In Snippet 2, the main method is defined within the Complex class itself.

Implications:
Snippet 1 (class Try and class Complex):

The Complex class is not public, so it can only be accessed from within the same package. This is useful when you have small programs or when Complex is purely a helper class for Try and you don't want it exposed outside the package.

Snippet 2 (public class Complex):
The Complex class is public, making it accessible from any other class in any package. This is useful when Complex represents a core concept or functionality that other parts of the application might need to use.
Which One to Use?

Snippet 1 is appropriate when:
You are writing a small program or prototype.
Complex is purely a helper class for Try and doesn't need to be used elsewhere.
You want to keep the scope of Complex limited to the current package.

Snippet 2 is appropriate when:
Complex represents a standalone entity or concept that might be used across different parts of your application or even by other applications.
You want to encapsulate both the data (a and b) and behavior (print method) of Complex in a reusable way.
You want to adhere to object-oriented principles of encapsulation and accessibility.