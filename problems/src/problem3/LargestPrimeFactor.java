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

        public static boolean isPrime(long number) {
            int sqrt = (int)Math.sqrt(number);
            while (sqrt > 1) {
                if (number % sqrt == 0)
                    return false;
                sqrt--;
            }
            return true;
        }

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
