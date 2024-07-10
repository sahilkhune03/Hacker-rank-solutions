//Java String Reverse
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int k=A.length();
        String s1= A.substring(0,k/2);
        String s2=A.substring((k+1)/2,k);
        if(s1.equals(new StringBuilder(s2).reverse().toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}



