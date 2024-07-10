package U_Anonymous;

public class AnonymousClass {

    //    class InnerClass extends OuterClass{
    //
    //    }

    // Can only used once it is object of outerclass / Anonymous class
    OuterClass obj = new OuterClass(){
          void sing(){

          }

          public void outerMethod(){

          }

    };

    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {
            System.out.println("hey");
        }
    };
}


class OuterClass{

    public void outerMethod(){
        System.out.println("Outer class");
    }
}



interface  SuperInterface{
    public void interfaceMethod();
}


// Anonymous class used while making custom comparator