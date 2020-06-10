import java.math.BigInteger;
import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        System.out.println(Sum(2000000));
    }
/*
    public static boolean[] rimes(int left, int right)
    {
        int sqrt = (int)Math.sqrt(right);
        while (left <= right)
        {

        }
    }
*/
    public static boolean[] primes(int n) {
        int crossLimit, sieveBound;
        sieveBound = ((n - 1) / 2);
        boolean[] sieve = new boolean[sieveBound];
        crossLimit = (int)((Math.sqrt(n) - 1) / 2);
        for (int i = 1; i < crossLimit; i++) {
            if (!sieve[i])
            {
                for (int j = 2 * i * (i + 1); j < sieveBound; j += (2 * i) + 1)
                {
                    sieve[j] = true;
                }
            }
        }
        return sieve;
    }

    public static BigInteger Sum(int n)
    {
        boolean[] sieve = primes(n);
        BigInteger sum = BigInteger.valueOf(2);
        for (int i = 1, len = sieve.length; i < len; i++) {
            if (!sieve[i])
            {
                sum = sum.add((BigInteger.valueOf(2).multiply(BigInteger.valueOf(i)))
                        .add(BigInteger.valueOf(1)));
            }
        }
        return sum;
    }
}
