
/**
 * @author  Sai Krishna Gottipalli
 * @since   09-06-2020
 */

package problem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiplesOf3and5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(multiplesSum(num));
        br.close();
    }

    public static long multiplesSum(int num)
    {
        long sum = 0;
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }
}
