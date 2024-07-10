import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int b = sc.nextInt();
            int h = sc.nextInt();

            if (b <= 0 || h <= 0) {
                throw new Exception("Breadth and height must be positive");
            } else if (b <= 100 && h <= 100) {
                int area = b * h;
                System.out.println(area);
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: " + e.getMessage());
        }
    }
}
