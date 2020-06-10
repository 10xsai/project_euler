package problem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Random;


public class MultiplesOf3and5
{
    // Main method
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());

        System.out.println(MultiplesOf3and5.Solution.fastSum(BigInteger.valueOf(num)));

        br.close();
    }

    // Solution class
    public static class Solution
    {
        public static BigInteger fastSum(BigInteger num)
        {
            // These are given divisors in problem
            BigInteger n1 = BigInteger.valueOf(3), n2 = BigInteger.valueOf(5);
            return fastSum(num, n1, n2);
        }

        public static BigInteger fastSum(BigInteger num, BigInteger n1, BigInteger n2)
        {
            BigInteger n3, q1, q2, q3, sum1, sum2, sum3, sum;
            n3 = n1.multiply(n2);
            q1 = num.divide(n1);
            q2 = num.divide(n2);
            q3 = num.divide(n3);
            //Sum of n natural numbers
            //((q1 * (q2 + 1)) / 2 )  multiplied with respective numbers
            sum1 = (n1.multiply(q1).multiply(q1.add(BigInteger.valueOf(1)))).divide(BigInteger.valueOf(2));
            sum2 = (n2.multiply(q2).multiply(q2.add(BigInteger.valueOf(2)))).divide(BigInteger.valueOf(2));
            sum3 = (n3.multiply(q3).multiply(q3.add(BigInteger.valueOf(3)))).divide(BigInteger.valueOf(2));
            sum = sum1.add(sum2.subtract(sum3));
            return sum;
        }

        public static long naiveSum(Long num)
        {
            long sum = 0;
            for (int i = 1; i < num; i++) {
                if (i % 3 == 0 || i % 5 == 0)
                    sum += i;
            }
            return sum;
        }
    }

    // Stress test implementation
    public static class StressTest {

        public static void main(String[] args)
        {
            Random rand = new Random();
            int testcases = 10000;
            long number;
            while (testcases-- > 0) {
                number = rand.nextInt(10000000) + 1;
                long naiveSum = MultiplesOf3and5.Solution.naiveSum(number);
                BigInteger fastSum = MultiplesOf3and5.Solution.fastSum(BigInteger.valueOf(number));
                if (BigInteger.valueOf(naiveSum).equals(fastSum))
                    break;
                System.out.println("true");
            }
        }
    }
}