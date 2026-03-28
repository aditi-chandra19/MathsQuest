import java.util.Arrays;

public class ArithmeticProgression {

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        if (arr.length < 2) {
            return true;
        }

        int dif = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != dif) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 1};

        boolean result = canMakeArithmeticProgression(arr);

        if (result) {
            System.out.println("Yes, it can form an Arithmetic Progression.");
        } else {
            System.out.println("No, it cannot form an Arithmetic Progression.");
        }
    }
}