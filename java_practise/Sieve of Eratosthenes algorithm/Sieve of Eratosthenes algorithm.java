import java.util.Arrays;

public class SieveOfEratosthenes {

    public static boolean[] sieve(int limit) {
        boolean[] primes = new boolean[limit + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;

        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    primes[j] = false;
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int limit = 30;
        boolean[] primes = sieve(limit);

        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 0; i <= limit; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
