public class RearrangeSticksWithKVisible {

    static int MOD = (int)(1e9 + 7);

    public static int rearrangeSticks(int n, int k) {
        int[][] cache = new int[1001][1001];
        return getReArrangeCount(n, k, cache);
    }

    private static int getReArrangeCount(int n, int k, int[][] cache) {

        // base cases
        if (k == 0) return 0;
        if (n == k) return 1;

        if (cache[n][k] != 0) return cache[n][k];

        // smallest stick at beginning → visible
        long ways1 = getReArrangeCount(n - 1, k - 1, cache);

        // smallest stick somewhere else → not visible
        long ways2 = getReArrangeCount(n - 1, k, cache) * (n - 1);

        // store result
        cache[n][k] = (int)((ways1 + ways2) % MOD);

        return cache[n][k];
    }

    public static void main(String[] args) {

        int n = 5;
        int k = 3;

        int result = rearrangeSticks(n, k);

        System.out.println("Number of ways to arrange " + n + 
                           " sticks with " + k + " visible: " + result);
    }
}