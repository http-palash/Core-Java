package S_staticKeyword;

public class notDependsOnObj {

    public static int count = 0;

        notDependsOnObj(){
            count++;
        }

    public static void main(String[] args) {
        /*
          1.The static members and methods belong to the class rather than the instance of the class
          When the implementation of the particular method is not dependent on the instance
          variables and instance methods. In this case, we can make the method to be static.

         */
        notDependsOnObj obj = new notDependsOnObj();
        notDependsOnObj obj1 = new notDependsOnObj();
        notDependsOnObj obj2 = new notDependsOnObj();
        notDependsOnObj obj3 = new notDependsOnObj();

        System.out.println(count);

    }
}
