public class CountDigitOne {

    public static int countDigitOne(int n) {
        int ans = 0;

        for (int i = 1; i <= n; i *= 10) {
            int div = i * 10;
            int q = n / div;
            int rem = n % div;

            ans += q * i;

            if (rem >= i) {
                ans += Math.min(rem - i + 1, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int n = 13;

        int result = countDigitOne(n);

        System.out.println("Total number of digit '1' from 1 to " + n + " is: " + result);
    }
}