import java.util.*;

public class BuildArrayWithStackOperations {

    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int streamCurrent = 1;

        for (int num : target) {
            while (streamCurrent < num) {
                result.add("Push");
                result.add("Pop");
                streamCurrent++;
            }
            result.add("Push");
            streamCurrent++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] target = {1, 3};
        int n = 3;

        List<String> result = buildArray(target, n);

        System.out.println("Operations:");
        for (String op : result) {
            System.out.print(op + " ");
        }
    }
}