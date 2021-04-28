public class LazyPrimeFactorization extends Thread implements Runnable{
    int n;
    public LazyPrimeFactorization(int n){
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                System.out.println("Lazy: "+ i);
            }
            try {
                Thread.sleep(100);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Lazy done!!");
    }

    private boolean isPrime(int n){
        if (n < 2) return false;
        else {
            for (int i = 2; i < n ; i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }
}
