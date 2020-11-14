/*
A and B are lower case strings. 
String.length()
OUTPUT: 
SUM of A and B
Lexicograpic Order 
Capitalize fir letter in A and B. Print them on a single line separated by space
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sizeA = A.length(); 
        int sizeB = B.length();
        int lengthOfString = sizeA + sizeB; 
        System.out.println(lengthOfString);
        
        if((A.compareTo(B))<=0) 
        System.out.println("No");
        else
        System.out.println("Yes"); 
        
        String upperA = A.substring(0,1).toUpperCase() + A.substring(1);
        String upperB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(upperA + " " + upperB);  
    }
}