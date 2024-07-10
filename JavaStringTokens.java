//Java String Tokens
import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] p = s.split("['!?,._@ ]+");
            System.out.println(p.length);
            for (String str : p)
                System.out.println(str);
        }
    }
}
