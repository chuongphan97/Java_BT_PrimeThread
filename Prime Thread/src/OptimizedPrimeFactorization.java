import java.sql.SQLOutput;

public class OptimizedPrimeFactorization extends Thread implements Runnable{
    int n;
    public OptimizedPrimeFactorization(int n){
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            if (isPrime(i)){
                System.out.println("Optimized: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Optimized done!!");
    }

    private boolean isPrime(int n){
        if (n < 2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }
}
