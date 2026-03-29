public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;

        if (n % 2 == 0) {
            return isUgly(n / 2);
        }
        if (n % 3 == 0) {
            return isUgly(n / 3);
        }
        if (n % 5 == 0) {
            return isUgly(n / 5);
        }

        return n == 1;
    }

    public static void main(String[] args) {

        int n = 6;  // try different values

        boolean result = isUgly(n);

        if (result) {
            System.out.println(n + " is an Ugly Number.");
        } else {
            System.out.println(n + " is NOT an Ugly Number.");
        }
    }
}