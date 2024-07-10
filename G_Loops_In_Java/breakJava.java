package G_Loops_In_Java;

public class breakJava {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i+=3) {

            if(i>=10) break;

            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
