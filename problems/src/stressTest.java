import problem1.MultiplesOf3and5;

import java.math.BigInteger;
import java.util.Random;


public class stressTest {

    public static void main(String[] args) {
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
