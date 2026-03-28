public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();

        int x = 121; // test input
        boolean result = obj.isPalindrome(x);

        System.out.println("Is Palindrome: " + result);
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;

        int check = 0;
        while (x > check) {
            check = check * 10 + x % 10;
            x /= 10;
        }

        return (x == check || x == check / 10);
    }
}
