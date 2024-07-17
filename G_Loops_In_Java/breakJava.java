package G_Loops_In_Java;

public class breakJava {

    public static void main(String[] args) {
        //used to immediately exit a loop when a certain condition is met.
        //The 'break' command does not work within an 'if' statement
        // if that if statement is not within a control-structure loop/switch.
        for (int i = 0; i < 20; i+=3) {

            if(i>=10) break;

            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
