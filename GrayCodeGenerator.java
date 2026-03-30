import java.util.*;

public class GrayCodeGenerator {

    public static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();

        int lim = 1 << n; // total numbers = 2^n

        for (int i = 0; i < lim; i++) {
            ans.add(i ^ (i >> 1));
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 3;

        List<Integer> result = grayCode(n);

        System.out.println("Gray Code sequence for n = " + n + ":");
        System.out.println(result);
    }
}