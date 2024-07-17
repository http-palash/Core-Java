package R_Encapsulation.Packages;

public class Person{

    public static int count = 0;
    private int age;
    private String name;
    boolean canBeChanged = true;

    public void setAge(int Age){
        if(canBeChanged){
            if(age > 0){
              this.age = Age;
            }else{
                System.out.println("Invalid age");
            }
        }
    }

    boolean canBeAccessed = true;
    public int getAge(){
        if(canBeAccessed){
            return age;
        }else{
            return -1;
        }
    }

}
