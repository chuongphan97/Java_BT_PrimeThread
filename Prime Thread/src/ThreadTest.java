public class ThreadTest {
    public static void main(String[] args) {
        int n = 1000;
        LazyPrimeFactorization t1 = new LazyPrimeFactorization(n);
        OptimizedPrimeFactorization t2 = new OptimizedPrimeFactorization(n);
        t1.start();
        t2.start();
    }
}
