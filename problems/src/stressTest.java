import problem1.MultiplesOf3and5;
import problem10.SumOfPrimes;

import java.math.BigInteger;
import java.util.Random;


public class stressTest {

    public static void main(String[] args) {
        Random rand = new Random();
        int testcases = 10000;
        int number;
        while (testcases-- > 0) {
            number = rand.nextInt(1000000) + 3;
            System.out.println(testcases);
            BigInteger naiveSum = SumOfPrimes.Solution.Sum(number);
            BigInteger fastSum = SieveOfEratosthenes.Sum(number);
            if (!naiveSum.equals(fastSum))
                break;
            System.out.println("true");
        }
    }
}
