//Java Int to String
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n); // Convert int to String

        // Check if n is less than -100 or greater than 100
        if (n < -100 || n > 100) {
            System.out.println(s); // Print the string representation of n
        }

        // Check if n is equal to the parsed integer value of s
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
