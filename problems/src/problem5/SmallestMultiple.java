package problem5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SmallestMultiple {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int range = Integer.parseInt(br.readLine());
        System.out.println(Solution.SmallestMultiple(range));
        br.close();
    }

    public static class Solution {
        public static int SmallestMultiple(int range)
        {
            for (int number = 1; true; number++) {
                if (isMultiple(number, range))
                    return number;
            }
        }

        public static boolean isMultiple(long number, int range) {
            while (range > 0) {
                if (number % range != 0)
                    return false;
                range--;
            }
            return true;
        }
    }
}
