/* There are three lines of output:
For the first line, sum the lengths of  A and B.
For the second line, write Yes if  A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and b and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java

*/

import java.io.*;
import java.util.*;

public class java7 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len=A.length()+B.length();
        System.out.println(len);
        
        if(A.compareTo(B) > 0)
        {
        System.out.println("Yes");
        
    }   else 
       {
        System.out.println("No");
       }
        System.out.println(A.substring(0, 1).toUpperCase()+ A.substring(1) + " " + B.substring(0,1).toUpperCase()+ B.substring(1));
        
        
    }
}

