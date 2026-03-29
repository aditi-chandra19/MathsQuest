public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {

        int count = 0;

        while (n > 0) {
            count = count + n / 5;
            n /= 5;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 25;  // try different values

        int result = trailingZeroes(n);

        System.out.println("Number of trailing zeroes in " + n + "! is: " + result);
    }
}