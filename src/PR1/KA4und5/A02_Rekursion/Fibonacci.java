package PR1.KA4und5.A02_Rekursion;

public class Fibonacci {


    public static int fib (int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            n = fib(n - 1) + fib(n - 2);
            return n;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < 10; i++){
            System.out.println(fib(i));
        }


    }
}
