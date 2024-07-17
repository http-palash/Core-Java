package P_Inheritance;

public class ChildClass extends SuperClass{


	void start(){
		super.print();
	}

	public static void main(String args[]){
		
		ChildClass c1 = new ChildClass();
		c1.print();
		// this.start();
		 // this.print();
	
	     // System.out.println("Hello from child class");
	}

}