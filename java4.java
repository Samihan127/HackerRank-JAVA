// Sample Input

// 42
// 3.1415
// Welcome to HackerRank's Java tutorials!


// Sample Output

// String: Welcome to HackerRank's Java tutorials!
// Double: 3.1415
// Int: 42 


import java.util.Scanner;

public class java4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter an integer:");
        int i = scan.nextInt();

        System.out.println("enter a double");
        double d=scan.nextDouble();

        scan.nextLine();

        System.out.println("enter a string");
        String s=scan.nextLine();
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
