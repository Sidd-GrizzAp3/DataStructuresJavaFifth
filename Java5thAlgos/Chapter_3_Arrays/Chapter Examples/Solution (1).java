import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        int N = scan.nextInt(); 
        System.out.println(factorial (N)); 
    }

    public static long factorial ( int  n) {
        /** recursively look at the int */
        if ( n != 0) {
            return n * factorial ( n - 1 ); 
        } 
        else {
            // since it is zero, return 1; 
            return 1; 
        }
    }
}