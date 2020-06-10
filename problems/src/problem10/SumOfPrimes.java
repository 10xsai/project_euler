
package problem10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class SumOfPrimes {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(Solution.Sum(num));
        br.close();
    }

    public static class Solution {
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

        public static BigInteger Sum(int n) {
            boolean[] sieve = primes(n);
            BigInteger sum = BigInteger.valueOf(2);
            for (int i = 1, len = sieve.length; i < len; i++) {
                if (!sieve[i]) {
                    sum = sum.add((BigInteger.valueOf(2).multiply(BigInteger.valueOf(i)))
                            .add(BigInteger.valueOf(1)));
                }
            }
            return sum;
        }
    }
}