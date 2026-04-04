import java.util.*;

public class ExclusiveTimeOfFunctions {

    public static int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<int[]> stk = new Stack<>();

        for (int i = 0; i < logs.size(); i++) {
            String[] str = logs.get(i).split(":");
            int id = Integer.parseInt(str[0]);
            String type = str[1];
            int time = Integer.parseInt(str[2]);

            if (!stk.isEmpty()) {
                int[] top = stk.peek();

                if (type.equals("start")) {
                    result[top[0]] += time - top[1];
                    stk.push(new int[]{id, time});
                } else {
                    time += 1;
                    result[top[0]] += time - top[1];
                    stk.pop();

                    if (!stk.isEmpty()) {
                        stk.peek()[1] = time;
                    }
                }
            } else {
                stk.push(new int[]{id, time});
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 2;

        List<String> logs = Arrays.asList(
            "0:start:0",
            "1:start:2",
            "1:end:5",
            "0:end:6"
        );

        int[] result = exclusiveTime(n, logs);

        System.out.println("Exclusive Times:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Function " + i + ": " + result[i]);
        }
    }
}