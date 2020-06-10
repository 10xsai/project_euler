package problem6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumSquareDifference {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        System.out.println(Solution.SumSquareDifference(num));
        System.out.println(Solution.SquaresOfSum(num));
        System.out.println(Solution.SumOfSquares(num));
        br.close();
    }

    public static class Solution {

        public static BigInteger SumSquareDifference(long range) {
            return SquaresOfSum(range).subtract(SumOfSquares(range));
        }

        public static BigInteger SquaresOfSum(long range) {
            BigInteger number = BigInteger.valueOf(range);
            BigInteger sum = (number.multiply(number.add(BigInteger.valueOf(1)))).
                                    divide(BigInteger.valueOf(2));
            return sum.multiply(sum);
        }

        public static BigInteger SumOfSquares(long range) {
            BigInteger number = BigInteger.valueOf(range);
            return (number
                    .multiply(number.add(BigInteger.valueOf(1)))
                    .multiply((number.multiply(BigInteger.valueOf(2))).add(BigInteger.valueOf(1))))
                    .divide(BigInteger.valueOf(6));
        }
    }
}
