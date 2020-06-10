public class isPrime {
    public static void main(String[] args) {
        long number = Long.parseLong("459651");
        System.out.println(validatePrime(number));
    }
    // Trial division method
    public static boolean validatePrime(long n)
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
}
