public class FindThePivotInteger {

    public static void main(String[] args) {
        FindThePivotInteger obj = new FindThePivotInteger();

        int n = 8; // test input
        int result = obj.pivotInteger(n);

        System.out.println("Pivot Integer: " + result);
    }

    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;

        int x = (int) Math.sqrt(totalSum);

        if (x * x == totalSum) {
            return x;
        }
        return -1;
    }
}