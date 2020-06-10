package problem3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LargestPrimeFactor {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(br.readLine());
        System.out.println(LargestPrimeFactor.Solution.LargestPrimeFactor(number));
        br.close();
    }


    public static class Solution {
        // Trial division method
        public static boolean isPrime(long n)
        {
            if (n == 1)
                return false;
            if (n == 2 || n == 3 || n == 5)
                return true;
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0)
                return false;
            if (n < 9)
                return true;
            int sqrt = (int)(Math.sqrt(n));
            int curr = 5;
            while (curr <= sqrt)
            {
                if (n % curr == 0)
                    return false;
                if (n % (curr + 2) == 0)
                    return false;
                curr += 6;
            }
            return true;
        }

        // Decrementing from backwards
        public static int LargestPrimeFactor(long number) {
            int sqrt = (int)Math.sqrt(number);
            while (sqrt > 1) {
                if (number % sqrt == 0 && isPrime(sqrt)) {
                    return sqrt;
                }
                sqrt--;
            }
            return 1;
        }
    }

}
