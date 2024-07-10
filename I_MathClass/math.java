package I_MathClass;

public class math {

    /*

        Math.min(x,y)
        Math.max(x,y)
        Math.sqrt(x)
        Math.pow(x,y)
        Math.abs(x)
        Math.random()
        Math.floor(x)
        Math.ceil(x)
        Math.round()

     */

    public static void main(String[] args) {
        int min = min(3,4);
        System.out.println(min);

        int a = 4;
        int b = 6;

        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.abs(-4));
        System.out.println(Math.abs(-4.5));
        System.out.println(Math.random());
        System.out.println(getRandom(10,20));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.round(5.8));
        System.out.println(Math.round(5.2));

        // trignometric function
        // asymptotic notation functions

    }

    public static int  min(int a, int b){
        if(a < b) return a;
        return b;
    }

    public static int getRandom(int a, int b){
        // [0,1)
        // return (int) (Math.random()*6)+1;

        // (random 0 - 0.99 )* (diff+1) + min no
        return (int) (Math.random() * (b-a+1) + a);
    }
}
