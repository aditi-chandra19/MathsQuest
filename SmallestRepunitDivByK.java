public class SmallestRepunitDivByK {

    public static int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;

        int rem = 0;

        for (int i = 1; i <= k; i++) {
            rem = (rem * 10 + 1) % k;
            if (rem == 0) return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int k = 3;  // try different values

        int result = smallestRepunitDivByK(k);

        if (result == -1) {
            System.out.println("No such number exists.");
        } else {
            System.out.println("Length of smallest repunit divisible by " + k + " is: " + result);
        }
    }
}