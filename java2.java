/* Task
In this challenge, you must read  3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125
*/

import java.util.*;

public class java2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter values of a");
        int a = scan.nextInt();
        System.out.println("enter values of b");
        int b =scan.nextInt();
        System.out.println("enter values of c");
        int c = scan.nextInt();
        
        scan.close();

        System.out.println("=====================================================");
        
        System.out.printf("values of a,b and c are %d %d %d\n",a,b,c);
        
        
    }
}