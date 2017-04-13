/**
 * Created by Amit on 25/02/17.
 */
public class FibonacciRecursion {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        System.out.println("FibonacciRecursion.main");
        System.out.println(dynamicFibnacci(43));
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

    }

    public static int fibonacci(int n){
        //double neg = -1;
//        if(n < 0){
//            return (fibonacci(n * -1)* (long)Math.pow(neg,(n+1)));
//        }else {

            if (n == 0 || n == 1){ return n;}
            System.out.println(n +"is ");
            return fibonacci(n - 1) + fibonacci(n - 2);
        //}
    }

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static long dynamicFibnacci(int n) {
        long f[] = new long[n+1];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
